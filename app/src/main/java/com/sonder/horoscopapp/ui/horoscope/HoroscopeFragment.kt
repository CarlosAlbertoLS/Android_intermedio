package com.sonder.horoscopapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sonder.horoscopapp.databinding.FragmentHoroscopeBinding
import com.sonder.horoscopapp.domain.model.HoroscopeInfo
import com.sonder.horoscopapp.domain.model.HoroscopeInfo.*
import com.sonder.horoscopapp.domain.model.HoroscopeModel
import com.sonder.horoscopapp.ui.horoscope.adapter.HoroscopeAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeFragment : Fragment() {
    private var _binding: FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!
    private val horoscopeViewModel: HoroscopeViewModel by viewModels()
    private lateinit var adapterHoroscope: HoroscopeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initUIState()
        initList()
    }

    private fun initList() {
        adapterHoroscope =
            HoroscopeAdapter() {
                val type = when (it) {
                    aquario -> HoroscopeModel.Aquarius
                    aries -> HoroscopeModel.Aries
                    cancer -> HoroscopeModel.Cancer
                    capricornio -> HoroscopeModel.Capricorn
                    escorpio -> HoroscopeModel.Scorpio
                    geminis -> HoroscopeModel.Gemini
                    leo -> HoroscopeModel.Leo
                    libra -> HoroscopeModel.Libra
                    picis -> HoroscopeModel.Pisces
                    sagitario -> HoroscopeModel.Sagittarius
                    taurus -> HoroscopeModel.Taurus
                    virgo -> HoroscopeModel.Virgo
                }
                findNavController().navigate(
                    HoroscopeFragmentDirections.actionHoroscopeFragmentToHoroscopeDetailActivity(
                        type = type
                    )
                )
            }
        binding.rvHoroscope.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = adapterHoroscope
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeViewModel.horoscope.collect() {
                    adapterHoroscope.updateList(it)
                }
            }
        }
    }
}