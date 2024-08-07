package main.kotlin.Sekcja_18_Klasy_i_dziedziczenie_zadania.zadanie2

open class Produkt(var vat: Int) {

    open fun wyswietlInformacje() {
        println("Podatek VAT wynosi $vat%.")
    }
}