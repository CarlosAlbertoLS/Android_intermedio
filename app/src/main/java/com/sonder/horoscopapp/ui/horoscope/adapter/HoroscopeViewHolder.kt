package com.sonder.horoscopapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.sonder.horoscopapp.databinding.ItemHoroscopeBinding
import com.sonder.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvHoroscope.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscope.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope,) {
                onItemSelected(horoscopeInfo)
            }
         }
    }

    private fun startRotationAnimation(view: View, horoscope:()-> Unit){
        view.animate().apply {
            duration = 550
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction(horoscope)
            start()
        }
    }
}