package com.example.cristianotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.items

import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn


//import androidx.compose.material3.ButtonColors

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


/*val  provider = GoogleFont.Provider(
providerAuthority = "com.google.android.gms.fonts",
providerPackage = "com.google.android.gms",
certificates = R.array.com_google_android_gms_fonts_certs
)*/
/*
val fontName = GoogleFont("Lobster Two")

val fontFamily = FontFamily(
    Font(googleFont = fontName, fontProvider = provider)
)*/
var a:Int=5; //con esta variable defino del ancho de los items
var i:Int=1;
var Pantalla1 = DisenoPanta() //Se declara el objeto pantalla 1
var listacanciones:Array<String> = arrayOf("  ","Aquí Estás","Al Estar ante Ti",
    "Anhelo Conocerte Espíritu Santo",
    "Adorarte, Quiero Adorarte","Al que está Sentado en el Trono","Al Borde de tu Gran Trono",
    "A tus pies","Cuan Grande es Dios","Como Zaqueo","Con mis Manos Levantadas","Como Dijiste",
    "Cuerdas de Amor",
    "Cerca de Ti","De tal Manera me Amó","Digno y Santo","Dios Quiero más de ti", "Creo en Ti",
    "Dios de lo Imposible", "De Gloria en Gloria te Veo","Dios es Rey","Digno",
    "El Espíritu de Dios Está", "Entra en la Presencia","En mi Corazón hay una Canción",
    "El es Jesús", "Eres mi Respirar","Jeshua","Llena éste Lugar","Levanto mis Manos",
    "Mereces la Gloria", "La Tierra Canta", "Más el Dios de toda Gracia",
    "Me has tomado en tus Brazos","No por Obras","Por un Momento en tu Presencia",
    "Perfume a tus Pies","Precioso Jesús","Padre, la Alabanza","Renuevame",
    "Si tu Presencia conmigo no va", "Sentado en su Trono","Señor de Señores")
//hasta señor de señores son
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Pantalla1.EstructuraPan()
            Listadesplazado()
        }
    }
}

@Composable
fun Listadesplazado() {


    LazyColumn(modifier = Modifier.padding(10.dp,120.dp)) {
        // Add a single item
        for(i in 1..42) {
            item {
                Text(
                    text = listacanciones[i],
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(0.dp, a.dp)
                )
            }
        }
    }
}


       // EscribirTextos("Bienvenido a Cristianotas, una plataforma muy \n intuitiva  para aprender canciones Cristianas", color = Color(255, 255, 255))



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


@Preview(showSystemUi = true)
@Composable
fun MostrarPreview() {
    Pantalla1.EstructuraPan()
    Listadesplazado()
}

