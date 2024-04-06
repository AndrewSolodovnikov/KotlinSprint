package lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val gainPercentage = 20

    val crystalBuff = ((gainPercentage * crystalOre) / ONE_HUNDRED_PERCENT).toInt()
    val ironBuff = ((gainPercentage * ironOre) / ONE_HUNDRED_PERCENT).toInt()

    println(crystalBuff)
    println(ironBuff)
}