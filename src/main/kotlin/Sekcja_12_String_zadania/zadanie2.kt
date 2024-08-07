package main.kotlin.Sekcja_12_String_zadania

fun main() {
    var tekst = """
        M@t0łek r@z zwiedz@ł z00
        I w0ł@ł c0 chwil@: "0-0!"
        "J@k@ brzydk@ p@pug@!"
        "Żyr@f@ jest z@ dług@!"
        "Sł0ń z@ wys0ki!"
        "A p0 c0 k0mu te f0ki?"
        "Zebr@ m@ f@rb0w@ne żebr@!"
        "Tygrys
        Chętnie by mnie stąd wygryzł!"
        "N@, @ z@jrzyjmy p0d d@szek:
        Żółw - tuś, br@tku, tuś!"
        "A t0? Pt@szek.
        Niezły pt@szek -
        Struś!"
        Wreszcie zbliż@ się d0 wielbłąd@,
        Uw@żnie mu się przygląd@
        I p0wi@d@ wsk@zując n@ nieg0 przez kr@ty:
        "0wszem, niezły. Niczeg0! Szk0d@ tylk0, że g@rb@ty!"
    """.trimIndent()

    // opcja 1
    tekst = tekst.replace('0', 'o').replace('@', 'a')

    println(tekst)
    println()

    // opcja 2
    var tekstTablica = tekst.toCharArray()

    for (i in tekstTablica.indices) {
        if (tekstTablica[i] == '0'){
            tekstTablica[i] = 'o'
        }

        if (tekstTablica[i] == '@'){
            tekstTablica[i] = 'a'
        }
    }

    println(tekstTablica)
}