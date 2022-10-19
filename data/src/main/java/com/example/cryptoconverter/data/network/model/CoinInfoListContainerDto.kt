package com.example.cryptoconverter.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// FIXME Зачем нужна эта обёртка вокруг списка? Почему бы не работать со списком напрямую?
data class CoinInfoListContainerDto(
    @SerializedName("data")
    @Expose
    val data: List<CoinInfoDto>?,
)