package com.sonder.horoscopapp.data.network.response

import io.kotlintest.shouldBe
import org.junit.Test
import com.sonder.horoscopapp.data.HoroscopeMotherObject.anyResponse

class HoroscopeResponseTest{

    @Test
    fun `toDomain should return a correct prediction model`(){
        //given
        val horoscopeResponse = anyResponse
        //when
        val predictionModel = horoscopeResponse.toDomain()
        //them
        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}