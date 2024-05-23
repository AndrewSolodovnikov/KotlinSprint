package lesson_16

fun main() {
    val customer = Customer("aaa", "dggfd333")

    println("Введите пароль:")
    val enteredPassword = readln()
    customer.validatePassword(enteredPassword)
}

class Customer(val login: String, private val password: String) {

    fun validatePassword(enteredPassword: String) {
        if (enteredPassword == password) println("Вы ввели верный пароль") else println("Введен неверный пароль")
    }
}