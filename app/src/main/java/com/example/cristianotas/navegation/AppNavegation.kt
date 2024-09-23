package com.example.cristianotas.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cristianotas.pantallas.Screen1
import com.example.cristianotas.pantallas.Screen2

@Composable
fun AppNavegation(){
        val navController = rememberNavController()
        
        NavHost(
                navController = navController,
                startDestination = AppsScreen.Screen1.route
        ){
                composable(route = AppsScreen.Screen1.route){
                        Screen1(navController)
                }
                composable(route = AppsScreen.Screen2.route + "/{text}",
                       arguments = listOf(navArgument(name = "text"){
                               type = NavType.StringType
                       })
                ){
                       Screen2(navController,it.arguments?.getString("text"))
                }
        }

}

