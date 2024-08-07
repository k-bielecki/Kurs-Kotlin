package main.kotlin.Sekcja_4_Operatory

fun main() {
    var wiek = 30
    // 18 <= wiek <= 70

    println(18 <= wiek && wiek <= 70)
    println(wiek in 18..70)

    println(wiek <= 30 || 65 <= wiek)

    var prawda = true
    println(!prawda)

    var czyLadny: Boolean = true
    var czyMadry: Boolean = true
    var wynik: Boolean
    wynik = czyLadny and czyMadry // &&
    wynik = czyLadny or czyMadry // ||
    wynik = (18 <= wiek) and (wiek <= 70)
}