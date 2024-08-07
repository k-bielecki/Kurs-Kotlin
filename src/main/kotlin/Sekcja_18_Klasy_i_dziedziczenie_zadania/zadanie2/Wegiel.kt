package main.kotlin.Sekcja_18_Klasy_i_dziedziczenie_zadania.zadanie2

class Wegiel(vat: Int = 23) : Produkt(vat) {

    var limit: Int? = null

    constructor(vat: Int = 23, limit: Int) : this(vat) {
        this.limit = limit
    }

    override fun wyswietlInformacje() {
        super.wyswietlInformacje()
        if (limit != null){
            println("Limit zakupu to $limit (ton)")
        }
    }
}