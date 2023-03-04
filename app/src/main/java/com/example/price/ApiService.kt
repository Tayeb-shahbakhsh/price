package com.example.price

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("jsonTest")
    fun getData() : Call<MutableList<CurrencyData>>

}