package main.kotlin.Sekcja_22.typeCheckCast

fun main() {
    var owoc: Owoc = Banan()
    wez(owoc)

    var zmienna: Any = 123
    sprawdzZmienna(zmienna)

    rzutowanie("Tekst")
}

fun rzutowanie(any: Any) {
    var liczba: Int? = any as? Int
    println("rzutowanie: $liczba")
}

fun wez(owoc: Owoc){
    if (owoc is Jablko) {
        owoc.zjedz()
    } else {
        println("Nie lubię innych owoców!")
    }
}

fun sprawdzZmienna(zmienna: Any) {
//    if (zmienna is Owoc) {
//        zmienna.zjedz()
//    } else if (zmienna is String) {
//        println(zmienna.uppercase())
//    } else {
//        println("Nie potrafię obsłużyć tej zmiennej")
//    }

    when (zmienna) {
        is Owoc -> zmienna.zjedz()
        is String -> zmienna.uppercase()
        else -> println("Nie potrafię obsłużyć tej zmiennej")
    }
}

