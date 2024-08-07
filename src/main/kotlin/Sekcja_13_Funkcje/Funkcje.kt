package main.kotlin.Sekcja_13_Funkcje

import kotlin.math.sqrt

fun main() {
    val wynik = dodawanie(10,5)
    println(wynik)

    wypiszNaEkran("Tekst z funkcji")
    wypiszNaEkran()

    var predkosc = obliczPredkosscSpadkuSwobodnego(2.0, 9.81)
    println("Predkosc: $predkosc")

    narysujTrojkat(8)
}

fun obliczPredkosscSpadkuSwobodnego (h: Double, g: Double = 10.0): Double{
    return sqrt(2*h*g)
}

fun narysujTrojkat(poziomy: Int = 5) {
    for (i in 1..poziomy){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}

fun dodawanie(a: Int, b: Int): Int{
    return a + b
}

fun wypiszNaEkran(tekst: String = "Nie podałeś tekstu") { //: Unit
    println(tekst)
}