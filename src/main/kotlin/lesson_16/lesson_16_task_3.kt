package lesson_16

fun main() {
    val customer = Customer()

    println("Введите пароль:")
    val enteredPassword = readln()
    customer.validatePassword(enteredPassword)
}

class Customer {
    private val login: String = "aaa"
    private val password = "jyuy213"

    fun validatePassword(enteredPassword: String) {
        if (enteredPassword == password) println("Вы ввели верный пароль") else println("Введен неверный пароль")
    }
}