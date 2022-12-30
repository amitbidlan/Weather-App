package com.example.jetpackcomposeapi.ui.theme

import android.icu.text.CaseMap.Title
import android.util.Log
import android.view.Surface
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeapi.StatesOfJapan


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Home() = MaterialTheme {
    val statesList = remember{StatesOfJapan().states}
    Scaffold(topBar = {
        TopAppBar(backgroundColor = MaterialTheme.colors.primary, modifier = Modifier.fillMaxWidth()) {
                Text( text = "天気情報")
        }
    }) {
        LazyColumn(){
            items(statesList.keys.toList()) {
                Surface(modifier = Modifier.clickable {

                    getWeatherDataOnClick(StateName = it)
                }) {
                    ListItemRecyclerView(item = it)

                }
            }
        }
    }
}


@Composable
fun ListItemRecyclerView(item:String) {
    MaterialTheme{
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            ) {
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = item, style = MaterialTheme.typography.body1)
            }
        }
    }
}

// Call this Function On each Click

fun getWeatherDataOnClick(StateName:String) {
    Log.d("MYSTATE", StateName)
    val stateCode = StatesOfJapan().states.getValue(StateName)
    Log.d("MYSTATE", stateCode)


}













