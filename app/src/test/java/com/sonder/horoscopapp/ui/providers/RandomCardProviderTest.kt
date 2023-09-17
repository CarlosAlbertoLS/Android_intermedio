package com.sonder.horoscopapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{

    @Test
    fun `getRandom card should return a random card`(){
        val randomCardProvider = RandomCardProvider()

        val card = randomCardProvider.getLucky()

        assertNotNull(card)
    }
}