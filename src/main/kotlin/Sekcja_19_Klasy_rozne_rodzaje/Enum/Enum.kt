package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.Enum

fun main() {
    println(PoryRoku.WIOSNA.ordinal)

    println(PoryRoku.values()[3].name)
    val poryRoku: PoryRoku = PoryRoku.valueOf("ZIMA")

    println(PoryRoku.LATO.nazwaPoAngielsku)

    when (poryRoku) {
        PoryRoku.WIOSNA -> println("roślinność zakwita")
        PoryRoku.LATO -> println("jest gorąco")
        PoryRoku.JESIEN -> println("liście spadają")
        PoryRoku.ZIMA -> println("spadł śnieg")
    }
}