package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.interfejs

class Audi : Samochod, Spalinowy {

    var uruchomiony: Boolean = false

    override fun start() {
        uruchomiony = true
    }

    override fun stop() {
        uruchomiony = false
    }

    override fun zatankuj(ilosc: Double) {
        TODO("Not yet implemented")
    }
}