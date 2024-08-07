package main.kotlin.Sekcja_12_String_zadania

fun main() {

    var tekst = """
        Kupił dziadek jajko w sklepie
        I po brzuchu już się klepie
        Naszykował szklankę z cukrem
        Kogel mogel sobie utrę
         
        Naglę co to, awantura
        Dziura w jajku w jajku dziura
        A w tej dziurze kurcze blade
        Kurcze blade wrzasnął dziadek
         
        Kurcze blade kurcze blade
        I ze ściany porwał szpadę
        Leci kurcze blade z trwogi
        Za kurczęciem dziadek srogi
         
        Złapał dziadek kurcze blade
        Zrobię z ciebie marmoladę
        Marmolada lepsza z jabłka
        Powiedziała trzeźwo babka
         
        Lepiej upiec kurcze blade
        W piekarniku na obiadek
        Jak wsadzili je do pieca
        To dopiero była heca
         
        Bo uciekło z pieca dziurką
        I zostało tylko piórko
        Piórko blade piórko blade
        Które zjadł na obiad dziadek
    """.trimIndent()

    tekst = tekst.replace("kurcze", "******")

    val informacja = "Informacja! Tekst został ocenzurowany"

    println("$tekst\n\n\n$informacja")

}