package main.kotlin.Sekcja_10_Pętle_zadania

fun main() {
    val table = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)

    for (i in 0..table.size - 1) {
        for (j in 0..table.size - 2) {
            if (table[j] > table[j + 1]) {
                val tmp = table[j]
                table[j] = table[j + 1]
                table[j + 1] = tmp
            }
        }
    }

    for (i in table){
        print(i)
        print(" ")
    }
}