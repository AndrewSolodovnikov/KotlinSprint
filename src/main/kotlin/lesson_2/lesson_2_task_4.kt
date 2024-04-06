package lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    var crystalOre = 7
    var ironOre = 11
    var gainPercentage = 20

    var crystalBuff = ((gainPercentage * crystalOre) / ONE_HUNDRED_PERCENT).toInt()
    var ironBuff = ((gainPercentage * ironOre) / ONE_HUNDRED_PERCENT).toInt()

    println(crystalBuff)
    println(ironBuff)
}