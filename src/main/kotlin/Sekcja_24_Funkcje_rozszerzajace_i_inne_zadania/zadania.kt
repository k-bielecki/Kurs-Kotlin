package main.kotlin.Sekcja_24_Funkcje_rozszerzajace_i_inne_zadania

fun main() {

    // zadanie 1
    println(12345.ostatniaCyfra())

    //zadanie 2
    var test1 = CiagZnakow("tak")
    println(!test1)
    var test2 = CiagZnakow("nie")
    println(!test2)
    var test3 = CiagZnakow("nie chce mi się uczyć")
    println(!test3)
    var test4 = CiagZnakow("zjem na kolację tosta")
    println(!test4)


    println(!"tak")
    println(!"nie")
    println(!"nie chce mi się uczyć")
    println(!"zjem na kolację tosta")


    // zadanie 3
    var array1 = intArrayOf(1,2,3)
    var array2 = intArrayOf(4,5,6)
//    var array3 = array1 + array2
    var array3 = array1.polacz(array2)
    for (i in 0..<array3.size) {
        print(array3[i])
    }

}

// zadanie 1
fun Int.ostatniaCyfra(): Int {
    var intToStr = this.toString()
    var lastNumber = intToStr.last().toString()
    return lastNumber.toInt()
}

//zadanie 2
data class CiagZnakow(var tekst: String) {

    operator fun not(): String{
         if (tekst.equals("tak")) {
             tekst = tekst.replace("tak", "nie")
             return tekst
         }

        if (tekst.equals("nie")) {
            tekst = tekst.replace("nie", "tak")
            return tekst
        }

        if (tekst.startsWith("nie ")) {
            tekst = tekst.replace("nie ", "")
            return tekst
        }
        else {
            return "nie $tekst"
        }
    }
}

operator fun String.not(): String {
    return when {
        this == "tak" -> this.replace("tak", "nie")
        this == "nie" -> this.replace("nie", "tak")
        this.startsWith("nie ") -> return this.replace("nie ", "")
        else -> return "nie $this"
    }
}


// zadanie 3

infix fun IntArray.polacz(tablica: IntArray): IntArray {
    var nowaTablica = this.plus(tablica)
    return nowaTablica
    }
