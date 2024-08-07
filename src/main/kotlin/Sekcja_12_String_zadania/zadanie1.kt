package main.kotlin.Sekcja_12_String_zadania

fun main() {
    var imie: String? = null

    // opcja 1
    if (imie == null) {
        println("Ja mam jedno ciastko, on/ona ma drugie")
    } else {
        println("Ja mam jedno ciastko, $imie ma drugie")
    }

    // opcja2
    var tekst = imie ?: "on/ona"
    println("Ja mam jedno ciastko, $tekst ma drugie")

}