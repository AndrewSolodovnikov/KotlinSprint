package lesson_7

fun main() {
    println("Введите число:")
    val enteredNumber = readln().toInt()

    for (number in 0 .. enteredNumber) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}