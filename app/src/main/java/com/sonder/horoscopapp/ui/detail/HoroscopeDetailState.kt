package com.sonder.horoscopapp.ui.detail

import com.sonder.horoscopapp.domain.model.HoroscopeModel
import javax.inject.Inject

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error: String):HoroscopeDetailState()
    data class Success(val prediction:String, val sign: String, val horoscopeModel: HoroscopeModel):HoroscopeDetailState()
}