package com.example.lovecalculator

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
//Retrofit.Builder
    val retrofit = Builder().baseUrl("https://love-calculator.p.rapidapi.com")
        .addConverterFactory(GsonConverterFactory.create(Gson())).build()

    val api = retrofit.create(LoveApi::class.java)
}