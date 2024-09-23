package com.example.cristianotas.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.cristianotas.Pantalla1
import com.example.cristianotas.SearchView
import com.example.cristianotas.datopro
import com.example.cristianotas.navegation.AppsScreen
import com.example.cristianotas.viewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen1(navController: NavController){
    Scaffold() {
        Pantalla1.EstructuraPan()
           // BodyContent(navController)
        SearchView(viewModel,navController)


    }
}

/*@Composable
fun BodyContent(navController: NavController){
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.3f).padding(top = 60.dp), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Hola Navegación")
            Button(onClick = {
                navController.navigate(route = AppsScreen.Screen2.route + "/${datopro}")
            }) {
                Text("Navega")
            }
        }
}*/
