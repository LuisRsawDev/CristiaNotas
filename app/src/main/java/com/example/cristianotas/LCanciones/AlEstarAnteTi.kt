package com.example.cristianotas.LCanciones

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cristianotas.Pantalla1

@Composable
fun AlestarAnteti(){

    val offset= Offset(3.0f,5.0f)

                Column(modifier = Modifier.fillMaxWidth(1f).padding(vertical = 110.dp),
                    ) {
                        Row (Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center){
                            Text(text="AL ESTAR ANTE TI",
                                Modifier.fillMaxWidth(1f),
                                textAlign = TextAlign.Center,
                                color = Color.White, fontSize = 20.sp,
                                 style = TextStyle(shadow = Shadow(
                                    color = Color.Black, offset = offset, blurRadius = 3f
                                )
                                )
                            )
                        }


                }


}


@Preview(showSystemUi = true)
@Composable
fun MostrarPreview() {

    Pantalla1.EstructuraPan(1)
        AlestarAnteti()

}