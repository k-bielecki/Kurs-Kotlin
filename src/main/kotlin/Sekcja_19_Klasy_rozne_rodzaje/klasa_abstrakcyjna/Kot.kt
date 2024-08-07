package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.klasa_abstrakcyjna

class Kot(nazwa: String) : ZwierzeDomowe(nazwa) {

    override var odglos: String = "miau miau"

    override fun wydajOdglos() {
        println("$nazwa wydał odgłos: $odglos")
    }
}