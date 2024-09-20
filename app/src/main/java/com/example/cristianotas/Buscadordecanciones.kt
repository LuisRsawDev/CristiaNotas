package com.example.cristianotas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Buscadordecanciones:ViewModel(){
    private var _listacanciones= MutableLiveData<List<Canciones>>()
    val listacanciones: LiveData<List<Canciones>> get() = _listacanciones

    init {
        _listacanciones.value = datosCanciones()
    }
}

fun datosCanciones():List<Canciones>{
    return listOf(
        Canciones("Aquí Estás","Adoración"),
        Canciones("Al Estar ante Ti","Adoración"),
        Canciones("Anhelo Conocerte Espíritu Santo","Adoración"),
        Canciones("Al Que está Sentado en el Trono","Adoración"),
                Canciones("Adorarte, Quiero Adorarte","Adoración"),
                Canciones("Al Borde de tu Gran Trono","Adoración"),
                Canciones("Como Zaqueo","Adoración"),
                Canciones("Como Dijiste","Adoración"),
                Canciones("Cuerdas de Amor","Adoración"),
                Canciones("Cerca de Ti","Adoración"),
        Canciones("De tal Manera me Amó","Adoración"),
        Canciones("Digno y Santo","Adoración"),
        Canciones("Dios Quiero más de ti","Adoración"),
        Canciones("Dios de lo Imposible","Adoración"),
        Canciones("De Gloria en Gloria te Veo","Adoración"),
        Canciones("Dios es Rey","Adoración"),
        Canciones("Digno","Adoración"),
        Canciones("El Espíritu de Dios Está","Adoración"),
        Canciones("Entra en la Presencia","Adoración"),
        Canciones("En mi Corazón hay una Canción","Adoración"),
        Canciones("El es Jesús","Adoración"),
        Canciones("Eres mi Respirar","Adoración"),
        Canciones("Jeshúa","Adoración"),
        Canciones("Llena éste Lugar","Adoración"),
        Canciones("Levanto mis Manos","Adoración"),
        Canciones("Mereces la Gloria","Adoración"),
        Canciones("La Tierra Canta","Adoración"),
        Canciones("Más el Dios de toda Gracia","Adoración"),
        Canciones("Me has tomado en tus Brazos","Adoración"),
        Canciones("No por Obras","Adoración"),
        Canciones("Por un Momento en tu Presencia","Adoración"),
        Canciones("Perfume a tus Pies","Adoración"),
        Canciones("Precioso Jesús","Adoración"),
        Canciones("Padre, la Alabanza","Adoración"),
        Canciones("Renuevame","Adoración"),
        Canciones("Si tu Presencia conmigo no va","Adoración"),
        Canciones("Sentado en su Trono","Adoración"),
        Canciones("Señor de Señores","Adoración"),

        //Alabanzas
        Canciones("Eres todo Poderoso","Alabanza"),
        Canciones("Eres Tú la única razón","Alabanza"),
        Canciones("Hay mucho Gozo en la Casa de Dios","Alabanza"),
        Canciones("Rompe los Cielos","Alabanza"),
        Canciones("Cambiaré Mi Tristeza","Alabanza"),
        Canciones("Mejor en un día en la casa de Dios","Alabanza"),
        Canciones("Somos el Pueblo de Dios","Alabanza"),
        Canciones("Hossana al Rey de Salvación","Alabanza"),
        Canciones("Grande y Fuerte","Alabanza"),
        Canciones("Hay Libertad","Alabanza"),
        Canciones("De Gloria en Gloria","Alabanza"),
        Canciones("Fuiste a la Cruz","Alabanza"),
        Canciones("Espíritu Santo","Alabanza"),
        Canciones("Salvo Soy","Alabanza"),





    )

}