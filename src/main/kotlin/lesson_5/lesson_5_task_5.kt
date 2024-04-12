package lesson_5

import kotlin.random.Random

const val HOW_MANY_NUMBERS = 3

fun main() {
    val userNumbers = mutableListOf<Int>()
    val randomNumbers = List(HOW_MANY_NUMBERS) { Random.nextInt(0, 42) }

    repeat(HOW_MANY_NUMBERS) {
        println("Введите число от 0 до 42:")
        val number = readln().toInt()
        if (number != null && number in 0..42) {
            userNumbers.add(number)
        } else {
            println("Введено неверное значение")
        }
    }

    val numberOfMatches = randomNumbers.intersect(userNumbers.toSet()).size

    when (numberOfMatches) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали 2 числа и выйграли крупную сумму!")
        1 -> println("Вы угадали 1 число и получаете утешительный приз!")
        0 -> println("Вы не угадали ни одного числа, в следующий раз удача вам улыбнется;)")
    }

    println("Выйгрышные числа: ${randomNumbers.joinToString( )}")
}