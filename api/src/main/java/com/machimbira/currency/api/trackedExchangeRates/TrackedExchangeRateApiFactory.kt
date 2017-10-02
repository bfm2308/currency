package com.machimbira.currency.api.trackedExchangeRates

import com.machimbira.currency.domain.mapper.TrackedExchangeRateMapper
import com.machimbira.currency.network.mapper.ExchangeRateMapper
import com.machimbira.currency.network.resources.exchangeRate.ExchangeRateResourceFactory
import com.machimbira.currency.persistence.repository.ExchangeRateRepository
import com.machimbira.currency.persistence.repository.TrackedRatesRepository
import retrofit2.Retrofit

class TrackedExchangeRateApiFactory {
    companion object {
        fun create(retrofit: Retrofit, exchangeRateRepository: TrackedRatesRepository, trackedExchangeRateMapper: TrackedExchangeRateMapper, exchangeRateMapper: ExchangeRateMapper): ITrackedExchangeRatesApi {
            val exchangeRateResources = ExchangeRateResourceFactory.create(retrofit = retrofit, exchangeRateMapper = exchangeRateMapper)
            return TrackedExchangeRatesApi(exchangeRateResources = exchangeRateResources, rateMapper = trackedExchangeRateMapper, rateRepository = exchangeRateRepository, exchangeRateMapper = com.machimbira.currency.domain.mapper.ExchangeRateMapper(), exchangeRateRepository = ExchangeRateRepository())
        }
    }
}