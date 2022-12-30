package com.example.jetpackcomposeapi.API

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        private const val Base_Url =
            "https://api.openweathermap.org/data/2.5/"
//"https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=a7710e886b004fe48d34e54b2a4c57d4"
        // Function to Return Retrofit Instance

       fun getRetrofitInstance(): Retrofit {
           return Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create(
               GsonBuilder().create())).build()
       }
    }
}