package com.example.jetpackcomposeapi.API

import androidx.compose.runtime.Composable
import com.example.jetpackcomposeapi.DataClass.WeatherAPIClass
import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("weather?lat=44.34&lon=10.99&appid=a7710e886b004fe48d34e54b2a4c57d4")
    suspend fun getWeatherDetails(): Response<WeatherAPIClass>
}

//http://api.openweathermap.org/geo/1.0/direct?q=Fukuoka,JP-40,JP&limit=1&appid=a7710e886b004fe48d34e54b2a4c57d4