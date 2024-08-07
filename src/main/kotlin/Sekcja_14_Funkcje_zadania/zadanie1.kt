package main.kotlin.Sekcja_14_Funkcje_zadania

fun main() {
    println(pobierzNastepnaLiczbeParzysta(11))
    println(pobierzNastepnaLiczbeParzysta(20))
}

fun pobierzNastepnaLiczbeParzysta(a: Int): Int {
    return if (a % 2 == 0) {
        a + 2
    } else {
        a + 1
    }
}