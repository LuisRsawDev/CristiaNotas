package com.example.cristianotas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
            //Box(Modifier.size(100.dp).background(Color.Green).constrainAs(cverde){})
            //Box(Modifier.size(100.dp).background(Color.Blue).constrainAs(cazul){})
            // Box(Modifier.size(100.dp).background(Color.Magenta).constrainAs(cmorado){})
            Box(Modifier.size(500.dp,45.dp).background(Color(131, 90, 183, 255)).constrainAs(barraSup){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            })

            Box(Modifier.size(500.dp,70.dp).background(Color(71, 11, 180, 255)).constrainAs(barraMoradasup){
                top.linkTo(barraSup.bottom)


            })

            Box(Modifier.size(500.dp,70.dp).background(Color(71, 11, 180, 255)).constrainAs(barraMoradainf){
                bottom.linkTo(barrainfe.top)


            })
                    //Del valor de dP debe ser 750 pero por cuestiones de organizacion se deja en 650
            Box(Modifier.size(500.dp,750.dp).background(Color(19, 148, 204, 255)).constrainAs(FondoContraint){
                top.linkTo(barraMoradasup.bottom)
                bottom.linkTo(barraMoradainf.top)


            })


            Box(Modifier.size(500.dp,10.dp).background(Color(131, 99, 183, 255)).constrainAs(barrainfe){
                bottom.linkTo(parent.bottom)


            })



            //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL
            Text("  CristiaNotas", Modifier.constrainAs(text){
                top.linkTo(barraSup.bottom, margin = 20.dp)
            },color = Color.White, fontSize = 20.sp,
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
                modifier =  Modifier.constrainAs(boton) {
                    //  top.linkTo(barraSup.top, margin = 14.dp)
                    end.linkTo(barraSup.end, margin = 1.dp)
                    top.linkTo(barraMoradasup.top, margin = 2.dp)
                },colors = ButtonDefaults.textButtonColors(
                    contentColor = Color(64, 12, 157, 255)
                )){ Text(". . .",fontWeight = FontWeight.ExtraBold,color = Color.White, fontSize = 15.sp,
                style = TextStyle(shadow = Shadow(
                    color = Color.Black, offset = offset, blurRadius = 3f
                )
                )
            ) }

        }

    }












}