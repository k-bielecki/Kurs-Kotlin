package main.kotlin.Sekcja_23_Funkcje_rozszerzajace_i_inne.extensionFunctions

fun main() {
    val sciana = Sciana()
    sciana.maluj()
    sciana.zniszcz()

    val text = "nasz tekst"
//    println(removeFirstLetter(text))
    println(text.removeFirstLetter())

    sciana.pokazTekst()
    sciana.pokazTekst("ext fun")
}

fun Sciana.zniszcz() {

}

fun Sciana.pokazTekst(text: String){
    println(text)
}

//fun removeFirstLetter(text: String): String{
//    return text.substring(1)
//}

fun String.removeFirstLetter(): String {
    return this.substring(1)
}