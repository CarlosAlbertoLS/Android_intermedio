package com.sonder.horoscopapp.data.network

import com.sonder.horoscopapp.data.network.response.HoroscopeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String): HoroscopeResponse
}