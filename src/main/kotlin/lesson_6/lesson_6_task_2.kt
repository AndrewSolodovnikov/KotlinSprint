package lesson_6

fun main() {
    var secondsInput = readln().toInt()
    var seconds = secondsInput

    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }

    println("Прошло $secondsInput секунд")
}