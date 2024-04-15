package lesson_7

fun main() {
    val rangeNumbersForSMS = 1000 .. 9999

    do {
        val generatedNumber = rangeNumbersForSMS.random()
        println("Ваш код авторизации: $generatedNumber")
        println("Введите код из СМС:")
        val enteredNumber = readln().toInt()
        var isCorrectCode = generatedNumber == enteredNumber
    } while (!isCorrectCode)

    println("Авторизация прошла успешно!")
}