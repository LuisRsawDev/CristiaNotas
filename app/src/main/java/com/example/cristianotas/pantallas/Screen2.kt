package com.example.cristianotas.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.cristianotas.Pantalla1

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen2(navController: NavController,text:String?){
    Scaffold(){
        Pantalla1.EstructuraPan()
        SegundaBodyContent(navController,text)
    }
}


@Composable
fun SegundaBodyContent(navController: NavController,text: String?){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Estoy en la segunda pantalla")
        text?.let{
            Text(it)
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("volver atras")
        }
    }
}
