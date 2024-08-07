package main.kotlin.Sekcja_17_Klasy_i_dziedziczenie

class Programista(
    imie: String,
    nazwisko: String,
    obowiazki: String,
    pensja: Int,
    var jezykProgramowania: String
) : Pracownik(imie, nazwisko, obowiazki, pensja) {

    override var lokalizacja: String = "zdalnie"

    override fun odmeldujSie() {
        super.odmeldujSie()
        println("Mój język programowania to: $jezykProgramowania")
    }
}