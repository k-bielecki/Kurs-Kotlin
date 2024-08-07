package main.kotlin.Sekcja_17_Klasy_i_dziedziczenie

fun main() {
    var pracownik: Pracownik = Pracownik("Jan", "Kowalski", "obsluga klienta", 5000)
    var programista: Programista = Programista("Adam", "Nowak", "programowanie aplikacji", 12000, "kotlin")

    pracownik.odmeldujSie()
    programista.odmeldujSie()

}