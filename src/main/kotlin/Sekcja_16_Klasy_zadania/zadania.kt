package main.kotlin.Sekcja_16_Klasy_zadania

// zadanie 1
class Prostokat(var a: Int, var b: Int) {

    fun obliczPole() {
        println(a * b)
    }
}

// zadanie 2
class Pogoda(var miasto: String, var temp: Int) {
    var wiatr: String? = null

    constructor(miasto: String, temp: Int, wiatr: String) : this(miasto, temp) {
        this.wiatr = wiatr
    }

}

// zadanie 3
class Czlowiek {

    var wiek: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 5
            }
        }
}

fun main() {
    // zadanie 1
    var rectangle = Prostokat(4, 5)
    rectangle.obliczPole()

    // zadanie 2
    val pogoda1 = Pogoda("Warszawa", 25, "NW")
    val pogoda2 = Pogoda("Warszawa", 30)

    // zadanie 3
    var czlowiek: Czlowiek = Czlowiek()
    czlowiek.wiek = 31
    println(czlowiek.wiek)

}