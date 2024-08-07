package main.kotlin.Sekcja_11_String

fun main() {
    var tekst1 = "Tekst1"
    var tekst2 = "Tekst2"
    var tekstCaly = tekst1 + tekst2
    println(tekstCaly)

    var tekstSzablon = "$tekst1$tekst2"
    println(tekstSzablon)

    var liczba = 999
    println("Liczba: $liczba")

    println("Dlugosc $tekst1: ${tekst1.length}")
}