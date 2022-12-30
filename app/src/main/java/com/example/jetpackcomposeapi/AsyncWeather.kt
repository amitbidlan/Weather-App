package com.example.jetpackcomposeapi

import androidx.compose.runtime.Composable

class AsyncWeather {
    companion object {
        private const val DEBUG_TaG = "AsyncSample"
        private const val APP_ID = "a7710e886b004fe48d34e54b2a4c57d4"
        private const val WEATHERINFO_URL =
            "http://api.openweathermap.org/geo/1.0/direct?q=London&limit=5&appid=$APP_ID"

    }
}

@Composable
fun receiveWeatherInfo(urlFull:String) {

}

