package main.kotlin.Sekcja_15_Klasy

class Person(var name: String, var lastName: String) {

    var age: Int? = null
    var adress: String? = null

    constructor(name: String, lastName: String, age: Int) : this(name, lastName) {
        this.age = age
    }

    constructor(name: String, lastName: String, age: Int, adress: String) : this(name, lastName, age){
        this.adress = adress
    }

}