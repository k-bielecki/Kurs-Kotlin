package main.kotlin.Sekcja_20_Klasy_rozne_rodzaje_zadania.zadanie2

data class Komputer(val procesor: Double, val pamiec: Int, val dysk: Int){}

fun main() {
    val komputer1 = Komputer(3.2, 8, 256)
    val komputer2 = Komputer(4.0, 16, 512)
    val komputer3 = Komputer(3.2, 8, 256)

    println(komputer1 == komputer2)
    println(komputer1 == komputer3)
}