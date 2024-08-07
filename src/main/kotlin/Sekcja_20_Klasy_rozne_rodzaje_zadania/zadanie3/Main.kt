package main.kotlin.Sekcja_20_Klasy_rozne_rodzaje_zadania.zadanie3

fun main() {
    println(Matematyka.dzielenie(2.0,4.0))
}

object Matematyka {
    fun dodawanie(a: Double, b: Double): Double {
        return a + b
    }

    fun odejmowanie(a: Double, b: Double): Double {
        return a - b
    }

    fun mnozenie(a: Double, b: Double): Double {
        return a * b
    }

    fun dzielenie(a: Double, b: Double): Double {
        if (b == 0.0) {
            println("Nie wolno dzielić przez zero!")
            return Double.MIN_VALUE
        } else {
            return a / b
        }
    }
}