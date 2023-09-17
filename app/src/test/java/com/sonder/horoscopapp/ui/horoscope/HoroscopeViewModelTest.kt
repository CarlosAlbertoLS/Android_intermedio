package com.sonder.horoscopapp.ui.horoscope

import com.sonder.horoscopapp.data.providers.HoroscopeProvider
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import com.sonder.horoscopapp.data.HoroscopeMotherObject.horoscopeInfoList
import io.kotlintest.properties.assertAll

class HoroscopeViewModelTest{

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel
    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewModel is created then horoscopes are loaded`(){
        every {
            horoscopeProvider.getHoroscopes()
        } returns horoscopeInfoList

        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assert(horoscopes.isNotEmpty())
    }
}