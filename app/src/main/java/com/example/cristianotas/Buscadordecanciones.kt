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
        Canciones("Aquí Estás"),
        Canciones(" Al Estar ante Ti"),
        Canciones("Anhelo Conocerte Espíritu Santo"),
        Canciones("Al Que está Sentado en el Trono"),
                Canciones("Adorarte, Quiero Adorarte"),
                Canciones("Al Borde de tu Gran Trono"),
                Canciones("Como Zaqueo"),
                Canciones("Como Dijiste"),
                Canciones("Cuerdas de Amor"),
                Canciones("Cerca de Ti"),
        Canciones("De tal Manera me Amó"),
        Canciones("Digno y Santo"),
        Canciones("Dios Quiero más de ti"),
        Canciones("Dios de lo Imposible"),
        Canciones("De Gloria en Gloria te Veo"),
        Canciones("Dios es Rey"),
        Canciones("Digno"),
        Canciones("El Espíritu de Dios Está"),
        Canciones("Entra en la Presencia"),
        Canciones("En mi Corazón hay una Canción"),
        Canciones("El es Jesús"),
        Canciones("Eres mi Respirar"),
        Canciones("Jeshua"),
        Canciones("Llena éste Lugar"),
        Canciones("Levanto mis Manos"),
        Canciones("Mereces la Gloria"),
        Canciones("La Tierra Canta"),
        Canciones("Más el Dios de toda Gracia"),
        Canciones("Me has tomado en tus Brazos"),
        Canciones("No por Obras"),
        Canciones("Por un Momento en tu Presencia"),
        Canciones("Perfume a tus Pies"),
        Canciones("Precioso Jesús"),
        Canciones("Padre, la Alabanza"),
        Canciones("Renuevame"),
        Canciones("Si tu Presencia conmigo no va"),
        Canciones("Sentado en su Trono"),
        Canciones("Señor de Señores")


    )

}