package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70_000
    val percent = 16.7 / 100
    val depositPeriod = 20

    println("%.3f".format(deposit * (1 + percent).pow(depositPeriod.toDouble())))
}