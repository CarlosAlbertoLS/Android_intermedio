package com.sonder.horoscopapp.domain.model

import com.sonder.horoscopapp.R

sealed class HoroscopeInfo(
    val name: Int,
    val img: Int
){
    data object aries:HoroscopeInfo(R.string.aries, R.drawable.aries)
    data object taurus:HoroscopeInfo(R.string.taurus, R.drawable.tauro)
    data object aquario:HoroscopeInfo(R.string.aquarius, R.drawable.aquario)
    data object cancer:HoroscopeInfo(R.string.cancer, R.drawable.cancer)
    data object capricornio:HoroscopeInfo(R.string.capricorn, R.drawable.capricornio)
    data object escorpio:HoroscopeInfo(R.string.scorpio, R.drawable.escorpio)
    data object geminis:HoroscopeInfo(R.string.gemini, R.drawable.geminis)
    data object leo:HoroscopeInfo(R.string.leo, R.drawable.leo)
    data object libra:HoroscopeInfo(R.string.libra, R.drawable.libra)
    data object picis:HoroscopeInfo(R.string.pisces, R.drawable.piscis)
    data object sagitario:HoroscopeInfo(R.string.sagittarius, R.drawable.sagitario)
    data object virgo:HoroscopeInfo(R.string.virgo, R.drawable.virgo)
}
