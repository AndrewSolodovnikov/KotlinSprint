package lesson_6

fun main() {
    var secondsInput = readln().toInt()

    Thread.sleep(secondsInput * 1000L)

    println("Прошло $secondsInput секунд")
}