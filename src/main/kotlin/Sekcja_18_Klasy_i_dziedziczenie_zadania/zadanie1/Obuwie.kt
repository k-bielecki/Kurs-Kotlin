package main.kotlin.Sekcja_18_Klasy_i_dziedziczenie_zadania.zadanie1

open class Obuwie(var rozmiar:Int, var cena: Int) {

    fun wyswietlDane(){
        println("Rozmiar: $rozmiar\n" +
                "Cena: $cena")
    }
}