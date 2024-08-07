package Sekcja_25_Kotlin_vs_Java

internal class Osoba(private val imie: String, private val nazwisko: String) {
    private var wiek = 0
    private var adres: String? = null

    constructor(imie: String, nazwisko: String, wiek: Int) : this(imie, nazwisko) {
        this.wiek = wiek
    }

    constructor(imie: String, nazwisko: String, wiek: Int, adres: String?) : this(imie, nazwisko, wiek) {
        this.adres = adres
    }

    fun przedstawSie() {
        println("$imie $nazwisko")
    }
}
