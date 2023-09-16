package com.sonder.horoscopapp.domain

import com.sonder.horoscopapp.data.network.response.HoroscopeResponse
import com.sonder.horoscopapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing: String):PredictionModel?
}