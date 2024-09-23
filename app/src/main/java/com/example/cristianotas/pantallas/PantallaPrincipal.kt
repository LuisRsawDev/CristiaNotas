package com.example.cristianotas.pantallas

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.cristianotas.Pantalla1
import com.example.cristianotas.SearchView
import com.example.cristianotas.viewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PantallaPrincipal(navController: NavController){
    Scaffold() {
        Pantalla1.EstructuraPan(0)
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
