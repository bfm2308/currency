package com.machimbira.currency

import com.machimbira.currency.domain.Currency

interface ICurrencyContract{
    interface View{
        fun showMyCurrencies(myCurrencies: List<Currency>)

    }

    interface UserActions{

        fun getCurrenciesList()
        fun getMyCurrencies()
        fun getExchangeRates()
    }
}