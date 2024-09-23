package com.example.cristianotas.navegation

sealed class AppsScreen(val route:String) {
    object Screen1:AppsScreen("Screen_1")
    object Screen2:AppsScreen("Screen_2")
}