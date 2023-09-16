package com.sonder.horoscopapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.sonder.horoscopapp.domain.model.PredictionModel

data class HoroscopeResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
){
    fun toDomain(): PredictionModel{
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}
