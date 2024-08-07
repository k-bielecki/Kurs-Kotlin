package main.kotlin.Sekcja_5_Operatory_zadania

fun main() {
    val x = false
    val y = true
    val z = false
    val wynik = !(x and y) or z
    println(wynik)
}