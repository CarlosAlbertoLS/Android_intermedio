package com.sonder.horoscopapp.domain.usecase

import com.sonder.horoscopapp.data.HoroscopeRepository
import com.sonder.horoscopapp.domain.Repository
import javax.inject.Inject

class GetPrediction @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}