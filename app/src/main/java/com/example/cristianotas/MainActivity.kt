package com.example.cristianotas

import android.os.Bundle

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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

//import androidx.compose.material3.ButtonColors

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.ui.text.font.Font
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

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
var a: Int = 8 //con esta variable defino del ancho de los items
var a2: Int = 10
var Pantalla1 = DisenoPanta() //Se declara el objeto pantalla 1
val viewModel =Buscadordecanciones()
/*val listacanciones: List<String> = listOf(
    "Aquí Estás", "Al Estar ante Ti",
    "Anhelo Conocerte Espíritu Santo",
    "Adorarte, Quiero Adorarte", "Al que está Sentado en el Trono", "Al Borde de tu Gran Trono",
    "A tus pies", "Cuan Grande es Dios", "Como Zaqueo", "Con mis Manos Levantadas", "Como Dijiste",
    "Cuerdas de Amor",
    "Cerca de Ti", "De tal Manera me Amó", "Digno y Santo", "Dios Quiero más de ti", "Creo en Ti",
    "Dios de lo Imposible", "De Gloria en Gloria te Veo", "Dios es Rey", "Digno",
    "El Espíritu de Dios Está", "Entra en la Presencia", "En mi Corazón hay una Canción",
    "El es Jesús", "Eres mi Respirar", "Jeshua", "Llena éste Lugar", "Levanto mis Manos",
    "Mereces la Gloria", "La Tierra Canta", "Más el Dios de toda Gracia",
    "Me has tomado en tus Brazos", "No por Obras", "Por un Momento en tu Presencia",
    "Perfume a tus Pies", "Precioso Jesús", "Padre, la Alabanza", "Renuevame",
    "Si tu Presencia conmigo no va", "Sentado en su Trono", "Señor de Señores"
)*/




//hasta señor de señores son
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Pantalla1.EstructuraPan()

           // ListarCanciones(listacanciones)


            SearchView(viewModel)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView(viewModel: Buscadordecanciones){
    var textobusqueda by remember { mutableStateOf("") }
    val context2 = LocalContext.current

    Column (
        modifier = Modifier.padding(vertical = 80.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(Modifier.size(60.dp))
        TextField(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
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
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedLabelColor = Color.Transparent
            )
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
                        .background(color = Color(8, 74, 126, 255))
                        .height(60.dp)
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ){

                    Row(verticalAlignment = Alignment.CenterVertically){
                    Text(text = it.nombrecancion,
                        textAlign = TextAlign.Left,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(0.dp, a.dp)
                            .fillMaxWidth()
                            .weight(1f) .clickable {
                                Toast.makeText(context2, "Click en: '${it.nombrecancion}'", Toast.LENGTH_SHORT).show()
                            }
                    )



                        }
                }


            }
        }
    }

}





/*@Composable
fun ListarCanciones(listacanciones: List<String>) {

    val scrollState = rememberLazyListState()
    val context = LocalContext.current

    /*val scrollSummary = "firstVisibleItemIndex {${scrollState.firstVisibleItemIndex}}, " +
            "firstVisibleItemScrollOffset {${scrollState.firstVisibleItemScrollOffset}}"*/
    var itemPosition by remember { mutableStateOf(0) }
    val coroutineScope = rememberCoroutineScope()

/*Column (modifier = Modifier.padding(vertical = 120.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
    TextField(
        value = if (itemPosition == 0) "" else itemPosition.toString(),
        onValueChange = { value ->
            itemPosition = (value.toIntOrNull() ?: 0)
            coroutineScope.launch { // (2)
                scrollState.animateScrollToItem((itemPosition - 1).coerceIn(0..listacanciones.size))
            }
        },
        label = { Text(text = "Buscar Canción") },
        modifier = Modifier.padding(horizontal = 20.dp)
    )}*/

   // Text(text = scrollSummary)
    LazyColumn(
        modifier = Modifier
            .padding(start = a2.dp, end = a2.dp, bottom = 90.dp, top = 180.dp)
            .fillMaxWidth(), state = scrollState

    ) {

        //Divider(modifier = Modifier.padding(vertical = 16.dp))

        items(listacanciones,key = { itemAsId -> itemAsId }) { item ->
            MostrarLista(item = item)

            //Divider()
        }


        /*// Add a single item
        for(i in 1..42) {

            item {
                Spacer(Modifier.size(3.dp))
                Column (Modifier.background(color = Color(8, 74, 126, 255))){

                Text(
                    text = listacanciones[i],
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(0.dp, a.dp).fillMaxWidth()
                )}
            }
        } */
    }

}
*/


/*
@Composable
fun MostrarLista(item: String) {
    //val scrollState = rememberLazyListState()
    val context2 = LocalContext.current




    Spacer(Modifier.size(3.dp))
    Box(
        modifier = Modifier
            .clip(shape = MaterialTheme.shapes.large)
            .background(color = Color(8, 74, 126, 255))
        .height(60.dp)
        .padding(horizontal = 16.dp, vertical = 8.dp)


    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "  $item",
                textAlign = TextAlign.Left,
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(0.dp, a.dp)
                    .fillMaxWidth()
                    .weight(1f) .clickable {
                        Toast.makeText(context2, "Clic en: '$item'", Toast.LENGTH_SHORT).show()
                    }
            )

        }


    }

}

@Composable
fun LazyColumn(
    modifier: Modifier! = Modifier,
    state: LazyListState = rememberLazyListState(),
    contentPadding: PaddingValues! = PaddingValues(0.dp),
    reverseLayout: Boolean! = false,
    verticalArrangement: Arrangement.Vertical! = if (!reverseLayout) Arrangement.Top else Arrangement.Bottom,
    horizontalAlignment: Alignment.Horizontal! = Alignment.Start,
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean! = true,
    content: (@ExtensionFunctionType LazyListScope.() -> Unit)?
): Unit*/

// EscribirTextos("Bienvenido a Cristianotas, una plataforma muy \n intuitiva  para aprender canciones Cristianas", color = Color(255, 255, 255))

/*
@Composable
fun EscribirTextos(name: String, color: Color) {
    val offset = Offset(3.0f, 5.0f)
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
*/

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
   // ListarCanciones(listacanciones)
    SearchView(viewModel)
}

