package main.kotlin.Sekcja_9_Pętle

fun main() {
    var tablica = intArrayOf(5, 55, 100, -3, -99)

    for (element in tablica){
        println(element)
    }

    println()

    for (i in 0..<tablica.size){
        println(tablica[i])
    }

    println()

    for (i in tablica.indices){
        println(tablica[i])
    }
}