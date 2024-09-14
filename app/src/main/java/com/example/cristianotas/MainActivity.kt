package com.example.cristianotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.ui.text.googlefonts.Font
//import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.ui.text.font.Font
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

val  provider = GoogleFont.Provider(
providerAuthority = "com.google.android.gms.fonts",
providerPackage = "com.google.android.gms",
certificates = R.array.com_google_android_gms_fonts_certs
)
/*
val fontName = GoogleFont("Lobster Two")

val fontFamily = FontFamily(
    Font(googleFont = fontName, fontProvider = provider)
)*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VentanaPrin()
            Barcontrain()
        }
    }
}

@Composable
fun VentanaPrin() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(56, 192, 179, 255)),
        horizontalAlignment = Alignment.CenterHorizontally

    ) { //Se determina la barra superior como una columna
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color(66, 7, 173, 255))) {
            Spacer(modifier = Modifier.padding(25.dp))

        }
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color(87, 82, 94, 255))
             )

        {
            Spacer(modifier = Modifier.padding(10.dp))


        }
       

        Spacer(modifier = Modifier.heightIn(50.dp))
        EscribirTextos("Bienvenido a Cristianotas, una plataforma muy \n intuitiva  para aprender canciones Cristianas", color = Color(255, 255, 255))
    }
}


@Composable
fun EscribirTextos(name: String, color: Color) {
    val offset= Offset(3.0f,5.0f)
    Text(
        text = name, color = color,
        fontSize = 15.sp,
        textAlign = TextAlign.Center,
        //modifier = width,
        fontFamily = MerriFontFamily, fontWeight = FontWeight.Light,
        style = TextStyle(

                    shadow = Shadow(
                        color = Color.Black, offset = offset, blurRadius = 2f
        )
        )
    )
}





    val MerriFontFamily = FontFamily(

        //Font(R.font.librebaskerville_italic, FontWeight.Medium),
        Font(R.font.merriweather_regular, FontWeight.Normal),
        //Font(R.font.merriweather_blackitalic, FontWeight.Normal),
       // Font(R.font.merriweather_bold, FontWeight.Bold)

    )

@Composable
fun Barcontrain(){
        ConstraintLayout(Modifier.fillMaxSize()){
            val offset= Offset(3.0f,5.0f)
            val(barraMoradasup,barrainfe,barraMoradainf,barraSup)=createRefs()
            val (text,boton) = createRefs()
            //Box(Modifier.size(100.dp).background(Color.Green).constrainAs(cverde){})
            //Box(Modifier.size(100.dp).background(Color.Blue).constrainAs(cazul){})
           // Box(Modifier.size(100.dp).background(Color.Magenta).constrainAs(cmorado){})
            Box(Modifier.size(500.dp,45.dp).background(Color(131, 90, 183, 255)).constrainAs(barraSup){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            })

            Box(Modifier.size(500.dp,60.dp).background(Color(72, 11, 180, 255)).constrainAs(barraMoradasup){
                top.linkTo(barraSup.bottom)


            })


            Box(Modifier.size(500.dp,10.dp).background(Color(131, 99, 183, 255)).constrainAs(barrainfe){
                bottom.linkTo(parent.bottom)


            })

            Box(Modifier.size(500.dp,70.dp).background(Color(72, 11, 180, 255)).constrainAs(barraMoradainf){
                bottom.linkTo(barrainfe.top)


            })

            //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL
            Text("  CristiaNotas",Modifier.constrainAs(text){
                top.linkTo(barraSup.bottom, margin = 20.dp)
            },color = Color.White, fontSize = 20.sp,
                style = TextStyle(shadow = Shadow(
                color = Color.Black, offset = offset, blurRadius = 3f
            )))
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
                ))) }

        }

}


@Preview(showSystemUi = true)
@Composable
fun MostrarPreview() {
    VentanaPrin()
    Barcontrain()
}

