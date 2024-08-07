package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.Klasa_Object

fun main() {
    // singleton
    UstawieniaAplikacji.pokazEkran()

    val ekran = Ekran()
    ekran.zmienUstawienia()

    println(UstawieniaAplikacji.nazwa)
}

class Ekran {
    fun zmienUstawienia(){
        UstawieniaAplikacji.nazwa = "Ekran zmienił ustawienia"
    }
}