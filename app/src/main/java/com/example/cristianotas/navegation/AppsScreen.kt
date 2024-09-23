package com.example.cristianotas.navegation

sealed class AppsScreen(val route:String) {
    object PantallaPrincipal:AppsScreen("Screen_1")
    object PantallaSecundaria:AppsScreen("Screen_2")
}