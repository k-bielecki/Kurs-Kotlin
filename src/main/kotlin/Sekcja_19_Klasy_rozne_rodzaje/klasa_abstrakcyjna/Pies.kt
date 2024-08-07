package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.klasa_abstrakcyjna

class Pies(nazwa: String) : ZwierzeDomowe(nazwa) {

    override var odglos: String = "hau hau"

    override fun wydajOdglos() {
        println("$nazwa wydał odgłos: $odglos")
    }
}