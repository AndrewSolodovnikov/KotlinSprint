package lesson_7

fun main() {
    println("Введите число:")
    val enteredNumber = readln().toInt()

    for (number in 0 .. enteredNumber step 2) {
            println(number)
    }
}