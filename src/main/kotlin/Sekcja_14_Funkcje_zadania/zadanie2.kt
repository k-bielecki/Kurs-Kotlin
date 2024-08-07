package main.kotlin.Sekcja_14_Funkcje_zadania

fun main() {
    println(czyPrzestepny(2000))
    println(czyPrzestepny(2024))
    println(czyPrzestepny(2077))
    println(czyPrzestepny(2100))

}

fun czyPrzestepny(rok: Int): Boolean = (rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0
