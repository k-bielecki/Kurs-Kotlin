package main.kotlin.Sekcja_25_Kotlin_vs_Java

class PlikKotlin {

    var liczba: Int? = null
    var tekst: String? = null

    fun funkcjaNicNieZwraca() {

    }

    fun funkcjaCosZwraca(): String {
        return "cos"
    }
    @JvmOverloads
    fun funkcjaZDomyslnymiParametrami(param1 :Int, param2: String, param3: Double = 0.0, param4: Boolean = false) {

    }

    companion object {
        @JvmField
        val ZMIENNA_VAL = "val"

        @JvmStatic
        fun funkcjaCompanion() {

        }
    }
}