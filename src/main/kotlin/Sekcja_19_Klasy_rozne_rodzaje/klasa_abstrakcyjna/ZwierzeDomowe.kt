package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.klasa_abstrakcyjna

abstract class ZwierzeDomowe(var nazwa: String) {

    abstract var odglos: String

    abstract fun wydajOdglos()

    fun zawolaj(){
        println("Chodź $nazwa")
    }
}