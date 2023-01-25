package com.example.lovecalculator

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    //параметры ?sname =Alice&fname=John
    @GET("getPercentage")
    fun calculateLove(
        @Query("fname") firstName:String,
        @Query("sname") secondName:String,
        @Header("X-RapidAPI-Key") key:String = "58019e6cbfmsh4bb7cd555d17564p1157c1jsnf40cbd1562c6",
        @Header("X-RapidAPI-Host") host:String = "Love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}