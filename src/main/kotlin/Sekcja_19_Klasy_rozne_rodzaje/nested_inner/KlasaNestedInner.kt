package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.nested_inner

fun main() {
    var amoled = SmartfonSamsung(150.0, 73.0).Amoled()
}

class SmartfonSamsung(val wysokosc: Double, val szerokosc: Double) {
    val gruboscObudowy: Double = 2.0

    inner class Amoled {
        val dlugoscA = wysokosc - gruboscObudowy
        val dlugoscB = szerokosc - gruboscObudowy
    }
}