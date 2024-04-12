package lesson_5

fun main() {
    val numberA = 2
    val numberB = 2
    println("Для входа введите результат сложения $numberA+$numberB")
    val enteredResult = readln().toInt()
    val verificationNumber = numberA + numberB

    if (enteredResult == verificationNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}