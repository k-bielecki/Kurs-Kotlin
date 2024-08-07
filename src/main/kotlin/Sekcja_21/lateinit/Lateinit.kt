package main.kotlin.Sekcja_22.lateinit

class Notatka {

    // można korzystać w ciele klasy
    // z var TAK, z val NIE
    // bez własnych getterów i setterów
    // nie moży być null'em
    // nie może być podstawowym typem
    lateinit var tekst: String
        private set

    fun zapisz(informacja: String) {
        tekst = informacja
    }
}

fun main() {
    var notatka = Notatka()
    notatka.zapisz("Nowa notatka")
    println(notatka.tekst)
}