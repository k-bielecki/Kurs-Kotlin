package main.kotlin.Sekcja_8_Instrukcje_warunkowe_zadania

fun main() {

    var a = 5
    var b = 3
    var c = 8

    var max = if (a > b) a else b
    max = if (max > c) max else c

    println(max)
}