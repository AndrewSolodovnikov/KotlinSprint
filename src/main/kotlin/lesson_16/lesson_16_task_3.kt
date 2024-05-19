package lesson_16

fun main() {
    val privateUser = PrivateUser()

    println("Введите пароль:")
    val enteredPassword = readln()
    privateUser.validatingPassword(enteredPassword)
}

class PrivateUser {
    private val login = "aaa"
    private val password = "jyuy213"

    fun validatingPassword(enteredPassword: String) {
        if (enteredPassword == password) println("Вы ввели верный пароль") else println("Введен неверный пароль")
    }
}