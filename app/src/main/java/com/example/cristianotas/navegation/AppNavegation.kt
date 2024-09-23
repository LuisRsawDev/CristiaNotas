package com.example.cristianotas.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cristianotas.pantallas.PantallaPrincipal
import com.example.cristianotas.pantallas.PantallaSecundaria

@Composable
fun AppNavegation(){
        val navController = rememberNavController()
        
        NavHost(
                navController = navController,
                startDestination = AppsScreen.PantallaPrincipal.route
        ){
                composable(route = AppsScreen.PantallaPrincipal.route){
                        PantallaPrincipal(navController)
                }
                composable(route = AppsScreen.PantallaSecundaria.route + "/{text}",
                       arguments = listOf(navArgument(name = "text"){
                               type = NavType.StringType
                       })
                ){
                       PantallaSecundaria(navController,it.arguments?.getString("text"))
                }
        }

}

