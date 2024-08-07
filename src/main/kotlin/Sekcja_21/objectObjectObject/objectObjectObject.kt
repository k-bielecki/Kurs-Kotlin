package main.kotlin.Sekcja_22.objectObjectObject

fun main() {
    val anonimowy = object {

    }

    val anonimowyDziedziczy = object : Runnable {
        override fun run() {
            TODO("Not yet implemented")
        }
    }
}

object Singleton {

}

class KlasaZeStaticiem {
    companion object{
        val POLE_STATYCZNE = 123
    }
}