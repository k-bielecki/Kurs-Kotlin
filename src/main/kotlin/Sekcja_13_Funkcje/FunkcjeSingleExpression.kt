package main.kotlin.Sekcja_13_Funkcje

fun main() {

}

fun dodawanieAlternatywne(a: Int, b: Int): Int = a + b

fun wypiszNaEkranAlternatywnie(tekst: String = "Nie podałeś tekstu!") = println(tekst)

fun czyOsobaPelnoletnia(wiek: Int): Boolean = if (wiek >= 18) true else false
