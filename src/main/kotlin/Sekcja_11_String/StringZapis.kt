package main.kotlin.Sekcja_11_String

fun main() {
    var tekstWieloliniowy = "Pierwsza linijka\nDruga Linijka\nTrzecia Linijka"
    var tekstRaw = """
        Pierwsza Linijka
        Druga Linijka
        Trzecia Linijka
    """.trimIndent()

    println(tekstWieloliniowy)
    println("")
    println(tekstRaw)
}