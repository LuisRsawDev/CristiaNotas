package com.example.cristianotas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cristianotas.navegation.AppNavegation

open class DisenoPanta {

    @Composable
    fun EstructuraPan(control1:Int){

        ConstraintLayout(Modifier.fillMaxSize()) {
            val control1 = control1
            val (barraMoradasup, barrainfe, barraMoradainf, barraSup, fondocontraint) = createRefs()

            val ancho = 100
            val ju = 736 //debe ser 736 es para el fondo
            val tamiconos = 26
            //val f=1
if(control1==0){
            Box(
                Modifier.size(500.dp, 45.dp).background(Color(26, 8, 58, 255))
                    .constrainAs(barraSup) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    })
            Box(
                Modifier.size(500.dp, 60.dp).background(Color(71, 11, 180, 255))
                    .constrainAs(barraMoradasup) {
                        top.linkTo(barraSup.bottom)

                    })
            {
                Row(
                    Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL
                    Text(
                        "  CristiaNotas",
                        Modifier.fillMaxWidth(0.80f),
                        color = Color.White, fontSize = 15.sp,
                        /* style = TextStyle(shadow = Shadow(
                            color = Color.Black, offset = offset, blurRadius = 3f
                        )
                        )*/
                    )

                     //Para usar y no usar el boton en la pantalla
                        //DISEÑO DE UN BOTON
                        Button(
                            onClick = { /* Do something */ },
                            // Assign reference "button" to the Button composable
                            // and constrain it to the top of the ConstraintLayout

                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )
                        ) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                    }
                }
            }  else if(control1==1){
    Box(
        Modifier.size(500.dp, 45.dp).background(Color(1, 23, 21, 255))
            .constrainAs(barraSup) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
    Box(
        Modifier.size(500.dp, 60.dp).background(Color(2, 59, 54, 255))
            .constrainAs(barraMoradasup) {
                top.linkTo(barraSup.bottom)

            })
    {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL
            Text(
                "  CristiaNotas",
                Modifier.fillMaxWidth(0.80f),
                color = Color.White, fontSize = 15.sp,
                /* style = TextStyle(shadow = Shadow(
                    color = Color.Black, offset = offset, blurRadius = 3f
                )
                )*/
            )

            //Para usar y no usar el boton en la pantalla
            //DISEÑO DE UN BOTON
            Button(
                onClick = { /* Do something */ },
                // Assign reference "button" to the Button composable
                // and constrain it to the top of the ConstraintLayout

                colors = ButtonDefaults.textButtonColors(
                    contentColor = Color(2, 59, 54, 255)
                )
            ) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = null,
                    modifier = Modifier.size(tamiconos.dp),
                    tint = Color.White
                )
            }
        }
    }
}

            if (control1 == 0) {
            Box(
                Modifier.size(500.dp, 60.dp).background(Color(71, 11, 180, 255))
                    .constrainAs(barraMoradainf) {
                        bottom.linkTo(barrainfe.top)


                    }) {
                Row(
                    Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {


                        Button(
                            onClick = { /* Do something */ },
                            // Assign reference "button" to the Button composable
                            // and constrain it to the top of the ConstraintLayout
                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )
                        ) {
                            Icon(
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
                            )
                        ) {
                            Icon(
                                Icons.Default.Notifications,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                        Button(
                            onClick = { /* Do something */ },

                            modifier = Modifier.width(ancho.dp).height(ancho.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(64, 12, 157, 255)
                            )
                        ) {
                            Icon(
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
                            )
                        ) {
                            Icon(
                                Icons.Default.Home,
                                contentDescription = null,
                                modifier = Modifier.size(tamiconos.dp),
                                tint = Color.White
                            )
                        }
                    }
                }

            } else if (control1 == 1) {
                    Box(
                        Modifier.size(500.dp, 60.dp).background(Color(2, 59, 54, 255))
                            .constrainAs(barraMoradainf) {
                                bottom.linkTo(barrainfe.top)


                            }) {
                        Row(
                            Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {


                         /*   Button(
                                onClick = { /* Do something */ },
                                // Assign reference "button" to the Button composable
                                // and constrain it to the top of the ConstraintLayout
                                modifier = Modifier.width(ancho.dp).height(ancho.dp),
                                colors = ButtonDefaults.textButtonColors(
                                    contentColor = Color(15, 95, 157, 255)
                                )
                            ) {
                                Icon(
                                    Icons.Default.MoreVert,
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
                                )
                            ) {
                                Icon(
                                    Icons.Default.Notifications,
                                    contentDescription = null,
                                    modifier = Modifier.size(tamiconos.dp),
                                    tint = Color.White
                                )
                            }
                            Button(
                                onClick = { /* Do something */ },

                                modifier = Modifier.width(ancho.dp).height(ancho.dp),
                                colors = ButtonDefaults.textButtonColors(
                                    contentColor = Color(64, 12, 157, 255)
                                )
                            ) {
                                Icon(
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
                                )
                            ) {
                                Icon(
                                    Icons.Default.Home,
                                    contentDescription = null,
                                    modifier = Modifier.size(tamiconos.dp),
                                    tint = Color.White
                                )
                            }*/
                        }
                    }

                }




            if (control1 == 0)  {      //Del valor de dP debe ser 750 pero por cuestiones de organizacion se deja en 650
                Box(Modifier.size(500.dp, ju.dp).background(
                    Brush.horizontalGradient(
                        listOf(
                            Color(
                                56,
                                160,
                                241,
                                255
                            ), Color(142, 195, 238, 255)
                        )
                    )
                ).constrainAs(fondocontraint) {
                    top.linkTo(barraMoradasup.bottom)
                    bottom.linkTo(barraMoradainf.top)
                })
        }else if(control1==1){
                Box(Modifier.size(500.dp, ju.dp).background(
                    Brush.horizontalGradient(
                        listOf(
                            Color(156, 232, 225, 255), Color(3, 117, 106, 255)
                        )
                    )
                ).constrainAs(fondocontraint) {
                    top.linkTo(barraMoradasup.bottom)
                    bottom.linkTo(barraMoradainf.top)
                })
        }

            Box(Modifier.size(500.dp,40.dp).background(Color(1, 23, 21, 255)).constrainAs(barrainfe){
                bottom.linkTo(parent.bottom)
                            })
        }

    }

    @Preview(showSystemUi = true)
    @Composable
    fun MostrarPreview() {
       // Pantalla1.EstructuraPan()
        // ListarCanciones(listacanciones)
        // SearchView(viewModel)
        AppNavegation()
    }









}