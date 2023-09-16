package com.sonder.horoscopapp.data

import android.util.Log
import com.sonder.horoscopapp.data.network.HoroscopeApiService
import com.sonder.horoscopapp.data.network.response.HoroscopeResponse
import com.sonder.horoscopapp.domain.Repository
import com.sonder.horoscopapp.domain.model.PredictionModel
import javax.inject.Inject

class HoroscopeRepository @Inject constructor(private val apiService: HoroscopeApiService) :
    Repository {
    override suspend fun getPrediction(sing: String):PredictionModel? {
        runCatching {
            apiService.getHoroscope(sing)
        }.onSuccess {
            return it.toDomain()
        }.onFailure {
            Log.e("horoscpe", "Ha ocurrido un error ${it.message}")
        }
        return null
    }
}