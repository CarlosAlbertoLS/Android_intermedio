package com.sonder.horoscopapp.data

import com.sonder.horoscopapp.data.network.response.HoroscopeResponse
import com.sonder.horoscopapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {
    val anyResponse = HoroscopeResponse("date","prediction", "taurus")
    val horoscopeInfoList = listOf(
        HoroscopeInfo.aries,
        HoroscopeInfo.taurus,
        HoroscopeInfo.geminis,
        HoroscopeInfo.cancer,
        HoroscopeInfo.leo,
        HoroscopeInfo.virgo,
        HoroscopeInfo.libra,
        HoroscopeInfo.escorpio,
        HoroscopeInfo.sagitario,
        HoroscopeInfo.capricornio,
        HoroscopeInfo.aquario,
        HoroscopeInfo.picis
    )
}