package main.kotlin.Sekcja_11_String

fun main() {
    var tekst: String = "Dowolny tekst"
    var tekstDlugi = "Dłuższy tekst zapisany za pomocą stringa"
    var tekstWspolny = tekst + ". "+ tekstDlugi
    println("Wyświetl: " + tekstWspolny)

    var dlugosc = tekst.length
    println(dlugosc)

    for (znak in tekst){
        println(znak)
    }
}