package main.kotlin.Sekcja_8_Instrukcje_warunkowe_zadania

fun main() {

    var a = 4
    var b = 3
    var c = 6

    if (a + b == 10 || a + c == 10 || b + c == 10){
        println("true")
    } else {
        println("false")
    }

    when (10) {
        a+b, a+c, b+c -> println("true")
        else -> println("false")
    }
}