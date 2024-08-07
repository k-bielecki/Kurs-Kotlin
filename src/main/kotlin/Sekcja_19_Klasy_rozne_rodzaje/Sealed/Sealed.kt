package main.kotlin.Sekcja_19_Klasy_rozne_rodzaje.Sealed

fun main() {

}

fun handleUserResponse(userResult: UserResult) {
    when (userResult) {
        is UserResult.Success -> userResult.save()
        is UserResult.Failure -> userResult.showError()
    }
}