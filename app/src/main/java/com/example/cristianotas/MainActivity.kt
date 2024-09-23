package com.example.cristianotas

import android.os.Bundle

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align

//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField

//import androidx.compose.material3.ButtonColors

import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.ui.text.font.Font
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cristianotas.navegation.AppNavegation
import kotlinx.coroutines.delay
import kotlinx.coroutines.selects.select
import java.nio.channels.Selector


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
var a: Int = 2 //con esta variable defino del ancho de los items
var a2: Int = 10
var tlcan:Int=15
var tltip:Int=10
var Pantalla1 = DisenoPanta() //Se declara el objeto pantalla 1
val viewModel =Buscadordecanciones()
var activarani:Boolean=false




//hasta señor de señores son
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {

          //  Pantalla1.EstructuraPan()



           // MotrarInitexto()
            AppNavegation()
           // SearchView(viewModel)

        }

    }
}


@Composable
fun MotrarInitexto(){
    val offset= Offset(3.0f,5.0f)

    activarani=true
    /*LaunchedEffect(key1 = true) {
        delay(1000)
        activarani=true
        println("Entro en la corrutina con valor ${activarani}")
    }*/
        //println(activarani)
    Column {
        Row (Modifier.fillMaxSize().padding(top = 130.dp),verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.Center) {
            //DISEÑO DEL TEXTO DEL TITULO PRINCIPAL

            AnimatedVisibility(visible = activarani) {
                Text(
                    "  Bienvenido a CristiaNotas, una app para aprender canciones cristianas de una forma más facil e intuitiva.",
                    Modifier.fillMaxWidth(0.92f),
                    textAlign = TextAlign.Center,
                    color = Color.White, fontSize = 15.sp,
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Black, offset = offset, blurRadius = 3f
                        )
                    )
                )

               /* LaunchedEffect(key1 = true) {
                        delay(2000)
                    activarani=false
                }*/

            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView(viewModel: Buscadordecanciones){
    var textobusqueda by remember { mutableStateOf("") }
    val context2 = LocalContext.current

    Column (
        modifier = Modifier.padding(vertical = 98.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(Modifier.size(84.dp))
        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(60.dp),

            value =  textobusqueda,
            onValueChange = {
                textobusqueda = it
            },
            placeholder = {

                Text(
                    text = "Buscar Canciones"


                )
            },
            maxLines = 1,
            singleLine = true,
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 20.sp
            ),
            trailingIcon = {
                Icon (
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                 )
            },
            shape = RoundedCornerShape(8.dp),


        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = a2.dp, end = a2.dp)
                .fillMaxHeight()

        ) {
            items(viewModel.listacanciones.value!!.filter {
                it.nombrecancion.lowercase().contains(textobusqueda.lowercase())

            }){

                Spacer(Modifier.size(3.dp))

                Box(
                    modifier = Modifier
                        .clip(shape = MaterialTheme.shapes.large)
                        .background(color = Color(4, 20, 117, 138))
                        .height(46.dp) //modifica ancho de columnas en Y
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ){

                    Row(verticalAlignment = Alignment.CenterVertically){
                        Column (modifier = Modifier.fillMaxWidth().fillMaxHeight()){
                            Text(text = it.nombrecancion,
                                textAlign = TextAlign.Left,
                                fontSize = tlcan.sp,
                                color = Color.White,
                                modifier = Modifier

                                    .padding(0.dp, a.dp)
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clickable {

                                        Toast.makeText(
                                            context2,
                                            "Click en: '${it.nombrecancion}'",
                                            Toast.LENGTH_SHORT


                                        ).show()
                                    }

                            )
                            
                            Text(text = it.tipocancion,
                                textAlign = TextAlign.Left,

                                fontSize = tltip.sp,
                                color = Color(227, 217, 217, 255)
                            )




                        }


                        }
                }


            }
        }
    }

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

  // SearchView(viewModel)
        AppNavegation()
   // SearchView(viewModel)

}

