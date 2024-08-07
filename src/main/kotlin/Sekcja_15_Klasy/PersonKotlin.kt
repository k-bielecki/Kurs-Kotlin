package main.kotlin.Sekcja_15_Klasy

class PersonKotlin {

    var name: String? = null
    var lastName: String? = null
    var age: Int? = null

    constructor(name: String?, lastName: String?) {
        this.name = name
        this.lastName = lastName
    }

    constructor(name: String?, lastName: String?, age: Int) : this(name, lastName) {
        this.age = age
    }

    var nazwa: String? = null
        get() {
            return "$name $lastName - wypisano z gettera"
        }
        private set

    var budget: Double = 0.0
        set(value) {
            field += value
        }


    fun introduceYourself() {
        println("Jestem $name $lastName i mam $age lat")
    }
}

fun main() {
    var osoba = PersonKotlin("Adam", "Nowak", 30)
    osoba.introduceYourself()
    osoba.name = "Jan"
    osoba.lastName = "Kowalski"
    osoba.introduceYourself()

    println(osoba.nazwa)

    osoba.budget = 1000.0
    osoba.budget = 2000.0
    println(osoba.budget)
}