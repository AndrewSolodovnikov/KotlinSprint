package lesson_5

fun main() {
    println("Для входа введите результат сложения 2+2")
    val enteredResult = readln().toInt()
    val verificationNumber = 4

    if (enteredResult == verificationNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}