package com.sonder.horoscopapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.sonder.horoscopapp.data.providers.HoroscopeProvider
import com.sonder.horoscopapp.domain.model.HoroscopeInfo
import com.sonder.horoscopapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(provider: HoroscopeProvider): ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = provider.getHoroscopes()
    }
}