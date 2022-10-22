package com.example.cryptoconverter.domain.usecase

import com.example.cryptoconverter.domain.repository.CoinRepository
import javax.inject.Inject

// FIXME Data - очень абстрактное слово, которое почти не дает никакой информации.
//  Лучше указать конкретно что загружается.
class LoadDataUseCase @Inject constructor(
    private val repository: CoinRepository,
) {

    // FIXME Minor Если метод ничего не возвращает предпочтительней его тело оборачивать в {}, вместо =
    suspend operator fun invoke() = repository.loadData()
}