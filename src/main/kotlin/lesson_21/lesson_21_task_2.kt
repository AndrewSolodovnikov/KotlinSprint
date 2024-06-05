package lesson_21

fun main() {
    val numbersList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val count = numbersList.evenNumbersSum()
    println(count)
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (number in this) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}