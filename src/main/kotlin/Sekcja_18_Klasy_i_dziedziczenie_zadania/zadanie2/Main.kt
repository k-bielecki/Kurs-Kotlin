package main.kotlin.Sekcja_18_Klasy_i_dziedziczenie_zadania.zadanie2

fun main() {
    var zywnosc = Zywnosc()
    var paliwo = PaliwoSilnikowe()
    var wegiel = Wegiel(limit = 10)

    zywnosc.wyswietlInformacje()
    paliwo.wyswietlInformacje()
    wegiel.wyswietlInformacje()

}