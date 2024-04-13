package lesson_6

import java.lang.Math.random

fun main() {
    var numberOfAttempt = 5
    val randomNumber = (1..9).random()

    while (numberOfAttempt > 0) {
        println("Введите ваше число:")
        val myNumber = readln().toInt()

        if (randomNumber == myNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно! Оставшееяся количество попыток ${--numberOfAttempt}")
        }
    }

    if (numberOfAttempt == 0) {
        println("Было загадано число $randomNumber")
    }
}