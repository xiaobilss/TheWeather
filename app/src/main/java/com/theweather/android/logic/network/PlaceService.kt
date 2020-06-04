package com.theweather.android.logic.network

import com.theweather.android.SunnyweatherApplication
import com.theweather.android.logic.model.PlaceRespose
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyweatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("Place") query: String) : Call<PlaceRespose>
}