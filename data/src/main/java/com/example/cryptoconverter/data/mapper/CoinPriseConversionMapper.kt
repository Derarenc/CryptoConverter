package com.example.cryptoconverter.data.mapper

import com.example.cryptoconverter.data.sharedprefs.model.CoinPriseConversionSharedPrefs
import com.example.cryptoconverter.domain.model.CoinInfo
import com.example.cryptoconverter.domain.model.CoinPriceConversion
import javax.inject.Inject

// FIXME Minor Опечатка в слове Price (поправить в названии других классов и методов)
class CoinPriseConversionMapper @Inject constructor() {

    companion object {
        private const val UNIT_CURRENCY = 1.0
    }

    fun mapSharedPrefsToEntity(
        sharedPrefs: CoinPriseConversionSharedPrefs,
    ) = CoinPriceConversion(priceConversion = sharedPrefs.priceConversion)

    fun mapEntityToSharedPrefs(
        coinPriceConversion: CoinPriceConversion,
    ) = CoinPriseConversionSharedPrefs(
        priceConversion = coinPriceConversion.priceConversion
    )

    // FIXME Это бизнес логика. Она должна быть на домейне в виде юзкейса.
    //  Задача маппера сконвертировать сущность из одного представления в другое.
    //  У твоего приложения похожая задача - сконвертировать из одной валюты в другую.
    //  Но весь код, который содержит бизнес правила должен быть выделен в отдельные классы, т.к. он особо важен.
    fun priceConversion(coinInfo: CoinInfo, amount: Double): Double? {
        return coinInfo.price?.let {
            UNIT_CURRENCY.div(it).times(amount)
        }
    }
}