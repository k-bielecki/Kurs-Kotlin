package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.klasa_data

fun main() {
    val osoba1 = Osoba("Jan", "Kowalski")
    val osoba2 = Osoba("Jan", "Kowalski")

    println(osoba1)
    println(osoba1 == osoba2)
}

data class Osoba(val imie: String, val nazwisko: String)