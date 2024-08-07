package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.klasa_anonimowa

fun main() {
    val mecz = object {
        var punkty: Int = 0
        fun zliczPunkty(){
            // ...
        }
    }
    mecz.punkty
    mecz.zliczPunkty()

    val mojListener = object : Listener {
        override fun onClick() {
            println("Click")
        }
    }

    mojListener.onClick()
}

interface Listener {
    fun onClick()
}