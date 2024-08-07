package main.kotlin.Sekcja_7_Instrukcje_warunkowe

fun main() {
    var liczba = 5

    when (liczba) {
        0 -> println("zero")
        1 -> println("jeden")
        2 -> println("dwa")
        3 -> {
            println("To jest liczba:")
            println("trzy")
        }

        in 4..9 -> println("liczba jest z przedziału 4 a 9")
        -1, -2, -3 -> println("liczba ujemna")
        else -> println("Przypadek nie został obsłużony")
    }

    var liczbaSlownie = when (liczba) {
        0 -> "zero"
        1 -> "jeden"
        2 -> "dwa"
        -1, -2, -3 -> "liczba ujemna"
        else -> "nie obsługuje takiej liczby"

    }
    println(liczbaSlownie)

    var a = 5
    var b = 10
    when {
        a > b -> println("a > b")
        a < b -> println("a < b")
        else -> println("a = b")
    }
}