package com.sonder.horoscopapp.ui.luky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sonder.horoscopapp.R
import com.sonder.horoscopapp.databinding.FragmentLukyBinding

class LukyFragment : Fragment() {
    private var _binding: FragmentLukyBinding? = null
    private val binding get() = _binding!!
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentLukyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}