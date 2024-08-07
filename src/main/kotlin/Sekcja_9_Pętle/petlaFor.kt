package main.kotlin.Sekcja_9_Pętle

fun main() {

    // for (int i = 0; i <= 5; i++){}
    for (i in 0..5) {
        println(i)
    }

    println()

    // for (int i = 0; i < 5; i++){}
    for (i in 0..<5) { //(i in 0 until 5)
        println(i)
    }

    println()

    // for (int i = 0; i <= 5; i+=2){}
    for (i in 0..5 step 2) {
        println(i)
    }

    println()

    // for (int i = 5; i <= 0; i--){}
    for (i in 5 downTo 0){
        println(i)
    }
}