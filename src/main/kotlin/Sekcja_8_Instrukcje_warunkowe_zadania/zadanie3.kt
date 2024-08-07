package main.kotlin.Sekcja_8_Instrukcje_warunkowe_zadania

fun main() {

    var liczba = 1

    when (liczba) {
        1 -> println("styczeń")
        2 -> println("luty")
        3 -> println("marzec")
        4 -> println("kwiecień")
        5 -> println("maj")
        6 -> println("czerwiec")
        7 -> println("lipiec")
        8 -> println("sierpień")
        9 -> println("wrzesień")
        10 -> println("październik")
        11 -> println("listopad")
        12 -> println("grudzień")


        in 1..2, 12 -> println("zima")
        in 3..5 -> println("wiosna")
        in 6..8 -> println("lato")
        in 9..11 -> println("jesień")

    }
}