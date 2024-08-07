package main.kotlin.Sekcja_7_Instrukcje_warunkowe

fun main() {
    var imie: String? = "Piotr"
    var inicjal: Char

//    inicjal = if (imie != null) {
//        imie.first()
//    } else {
//        ' '
//    }

    inicjal = imie?.first() ?: ' '

    println(inicjal)
}