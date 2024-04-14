package lesson_8

const val DAY_OF_STATISTICS = 7
fun main() {
    val rangeAdImpressions = (40000..50000)
    var arrayAdImpressions: ArrayList<Int> = arrayListOf()

    for (day in 1..DAY_OF_STATISTICS) {
        val adImpressions = rangeAdImpressions.random()
        arrayAdImpressions.add(adImpressions)
    }

    var sum = 0
    for (day in arrayAdImpressions) {
        sum += day
    }

    println(sum)
}