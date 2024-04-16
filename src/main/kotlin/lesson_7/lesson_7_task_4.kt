package lesson_7

fun main() {
    println("Введите количество секунд:")
    var enteredSeconds = readln().toInt()

    for (second in enteredSeconds downTo 1) {
        Thread.sleep(1000)
        println("Осталось секунд до конца ${second - 1}")
    }

    println("Время вышло")
}