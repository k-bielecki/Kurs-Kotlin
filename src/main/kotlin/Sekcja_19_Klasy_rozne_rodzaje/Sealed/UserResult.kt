package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.Sealed

sealed class UserResult {
    class Success(val user: User) : UserResult() {
        fun save() {
            // ...
        }
    }

    class Failure(val message: String) : UserResult() {
        fun showError() {
            println("Coś poszło nie tak")
        }
    }

}

class User {

}