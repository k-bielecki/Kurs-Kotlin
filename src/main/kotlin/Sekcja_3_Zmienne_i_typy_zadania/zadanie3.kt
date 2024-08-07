package main.kotlin.Sekcja_3_Zmienne_i_typy_zadania

fun main() {
    var a: Double? = 12.54
    var b: Double? = 33.77

    var tmp: Double? = a

    a = b
    b = tmp

    println(a?.toInt())
    println(b?.toInt())
}