package com.example.jetpackcomposeapi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.jetpackcomposeapi.API.APIService
import com.example.jetpackcomposeapi.API.RetrofitInstance
import com.example.jetpackcomposeapi.DataClass.WeatherAPIClass
import com.example.jetpackcomposeapi.ui.theme.Home
import com.example.jetpackcomposeapi.ui.theme.JetPackComposeAPITheme
import retrofit2.Response
import retrofit2.create

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeAPITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val retService = RetrofitInstance.getRetrofitInstance().create(APIService::class.java)
                    val responseLiveData:LiveData<Response<WeatherAPIClass>> = liveData {
                        val response = retService.getWeatherDetails()
                        emit(response)
                    }
                    responseLiveData.observe(this, Observer {
                        val weatherData = it.body()
                        if (weatherData!=null){
                            Log. i("MYTAG", weatherData.toString())
                        }
                    })

                    Home()
                }
            }
        }
    }
}

// Retrofit Call Function Main Activity
@Composable
fun CallAPI() {

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeAPITheme {
        Greeting("Android")
    }
}