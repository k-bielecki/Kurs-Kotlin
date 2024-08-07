package main.kotlin.Sekcja_23_zadania

fun main() {

}

class A {
    lateinit var b: String
}

fun sprawdz(zmienna: Any) {
    when (zmienna) {
        is Int -> println("Czy liczba $zmienna jest podzielna przez 2: ${zmienna % 2 == 0}")
        is String -> println("Ciąg znaków \"$zmienna\" jest długości ${zmienna.length}")
        is DoubleArray -> println("Suma liczba tablicy ${zmienna.contentToString()} wynosi ${zmienna.sum()}")
        is Char -> println(zmienna)
    }
}

class Kolo (var r: Double) {

    companion object {
        const val PI = 3.141592653589793
    }

    fun obwod(): Double = 2 * PI * r
    fun pole(): Double = PI * r * r
}