package com.sonder.horoscopapp.data.providers

import com.sonder.horoscopapp.domain.model.HoroscopeInfo
import com.sonder.horoscopapp.domain.model.HoroscopeInfo.*
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            aries,
            taurus,
            geminis,
            cancer,
            leo,
            virgo,
            libra,
            escorpio,
            sagitario,
            capricornio,
            aquario,
            picis
        )
    }
}