package main.kotlin.Sekcja_10_Pętle_zadania

fun main() {

    val table = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
    var countOfEven = 0

    for (i in table){
        if (i % 2 == 0){
            countOfEven++
        }
    }

    println(countOfEven)
}