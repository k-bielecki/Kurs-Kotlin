package main.kotlin.Sekcja_18_Klasy_i_dziedziczenie_zadania.zadanie1

fun main() {
    var obuwie = Obuwie(42, 100)
    var klapki = Klapki(38, 150)
    var sztyblety = Sztyblety(46, 300)

    obuwie.wyswietlDane()
    klapki.wyswietlDane()
    sztyblety.wyswietlDane()
}