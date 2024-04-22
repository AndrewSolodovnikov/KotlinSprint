package lesson_8

const val DAY_OF_STATISTICS = 7
fun main() {
    val rangeAdImpressions = (40000..50000)
    var arrayAdImpressions: Array<Int> = arrayOf()

    for (day in 1..DAY_OF_STATISTICS) {
        val adImpressions = rangeAdImpressions.random()
        arrayAdImpressions += adImpressions
    }

    val weekAdImpressions = arrayAdImpressions.sum()

    println(weekAdImpressions)
}