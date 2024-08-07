package main.kotlin.Sekcja_14_Funkcje_zadania

fun main() {
    wyswietlLiczby(5,10)
    println()
    wyswietlLiczby(koniec = 10)
}

fun wyswietlLiczby(start: Int = 1, koniec: Int) {
    for (i in start..koniec){
        print("$i ")
    }
}