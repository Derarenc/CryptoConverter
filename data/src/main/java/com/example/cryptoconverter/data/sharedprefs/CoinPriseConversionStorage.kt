package com.example.cryptoconverter.data.sharedprefs

import com.example.cryptoconverter.data.sharedprefs.model.CoinPriseConversionSharedPrefs

interface CoinPriseConversionStorage {

    // FIXME Minor Обычно стараются давать парные именования get/set, read/update
    fun save(coinPriseConversionSharedPrefs: CoinPriseConversionSharedPrefs)

    fun get(): CoinPriseConversionSharedPrefs
}