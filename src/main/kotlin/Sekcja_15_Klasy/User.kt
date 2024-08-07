package main.kotlin.Sekcja_15_Klasy

class User private constructor(var login: String, private var password: String) {
    // java: public / protected / private / brak modyfikatora
    public var polePublic: String? = null
    protected var poleProtected: String? = null
    private var polePrivate: String? = null
    var poleBezModyfikatora: String? = null //public
    internal var poleInternal: String? = null
}

fun main() {
    //var user = User("test123", "test123")

}