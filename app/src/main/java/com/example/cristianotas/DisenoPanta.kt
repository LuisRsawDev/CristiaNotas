package com.example.cristianotas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

open class DisenoPanta {

    @Composable
    fun EstructuraPan(){
        ConstraintLayout(Modifier.fillMaxSize()){
            val offset= Offset(3.0f,5.0f)
            val(barraMoradasup,barrainfe,barraMoradainf,barraSup,FondoContraint)=createRefs()
            val (text,boton) = createRefs()
            var ancho:Int=100
            var ju:Int=736;//debe ser 730 es para el fondo
            var tamiconos:Int=26;

            Box(Modifier.size(500.dp,45.dp).background(Color(26, 8, 58, 255)).constrainAs(barraSup){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            })

            Box(Modifier.size(500.dp,60.dp).background(Color(71, 11, 180, 255)).constrainAs(barraMoradasup){
                top.linkTo(barraSup.bottom)


            }){
                Row (Modifier.fillMaxSize(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                    //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL
                    Text("  CristiaNotas",
                        Modifier.fillMaxWidth(0.80f),
                        color = Color.White, fontSize = 20.sp,
                        style = TextStyle(shadow = Shadow(
                            color = Color.Black, offset = offset, blurRadius = 3f
                        )
                        )
                    )
                    //DISEÑO DE UN BOTON
                    Button(
                        onClick = { /* Do something */ },
                        // Assign reference "button" to the Button composable
                        // and constrain it to the top of the ConstraintLayout

                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(64, 12, 157, 255)
                        )){
                        Icon (
                            Icons.Default.Menu,
                            contentDescription = null,
                            modifier = Modifier.size(tamiconos.dp),

                            tint = Color.White
                        )
                    }
                }
            }

            Box(Modifier.size(500.dp,60.dp).background(Color(71, 11, 180, 255)).constrainAs(barraMoradainf){
                bottom.linkTo(barrainfe.top)


            }){
                    Row (Modifier.fillMaxSize(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                        Button(
                            onClick = { /* Do something */ },
                            // Assign reference "button" to the Button composable
                            // and constrain it to the top of the ConstraintLayout
                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                                    colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )){
                            Icon (
                                Icons.Default.Face,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                        Button(
                                onClick = { /* Do something */ },
                        // Assign reference "button" to the Button composable
                        // and constrain it to the top of the ConstraintLayout
                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(64, 12, 157, 255)
                        )){
                        Icon (
                            Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier.size(tamiconos.dp),
                            tint = Color.White
                        )
                    }
                        Button(
                            onClick = { /* Do something */ },
                            // Assign reference "button" to the Button composable
                            // and constrain it to the top of the ConstraintLayout
                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )){
                            Icon (
                                Icons.Default.Favorite,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                        Button(
                            onClick = { /* Do something */ },
                            // Assign reference "button" to the Button composable
                            // and constrain it to the top of the ConstraintLayout
                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )){
                            Icon (
                                Icons.Default.Home,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                    }

            }
                    //Del valor de dP debe ser 750 pero por cuestiones de organizacion se deja en 650
            Box(Modifier.size(500.dp,ju.dp).background(Color(19, 148, 204, 255)).constrainAs(FondoContraint){
                top.linkTo(barraMoradasup.bottom)
                bottom.linkTo(barraMoradainf.top)


            })


            Box(Modifier.size(500.dp,40.dp).background(Color(26, 8, 58, 255)).constrainAs(barrainfe){
                bottom.linkTo(parent.bottom)


            })





        }

    }


    @Preview(showSystemUi = true)
    @Composable
    fun MostrarPreview() {
        Pantalla1.EstructuraPan()
        // ListarCanciones(listacanciones)
        // SearchView(viewModel)
    }









}