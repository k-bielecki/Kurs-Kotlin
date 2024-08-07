package main.kotlin.Sekcja_4_Operatory

fun main() {
    var a = 5
    var b = 10

    var wynik: Boolean

    wynik = a == b
    println("a == b: " + wynik)

    wynik = a != b
    println("a != b: " + wynik)

    wynik = a < b
    println("a < b: " + wynik)

    wynik = a <= b
    println("a <= b: " + wynik)

    wynik = a > b
    println("a > b: " + wynik)

    wynik = a >= b
    println("a >= b: " + wynik)

    wynik = 7 in a..b
    println("7 in a..b " + wynik)

    wynik = 7 !in a..b
    println("7 !in a..b " + wynik)
}