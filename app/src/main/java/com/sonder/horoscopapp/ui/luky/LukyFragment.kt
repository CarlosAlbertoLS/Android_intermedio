package com.sonder.horoscopapp.ui.luky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.sonder.horoscopapp.R
import com.sonder.horoscopapp.databinding.FragmentLukyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LukyFragment : Fragment() {
    private var _binding: FragmentLukyBinding? = null
    private val binding get() = _binding!!
    private val luckViewModel:LuckViewModel by viewModels()
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentLukyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}