package lesson_7

fun main() {
    println("Введите количество секунд:")
    var enteredSeconds = readln().toInt()

    for (second in 1 .. enteredSeconds) {
        Thread.sleep(1000)
        println("Осталось секунд до конца ${--enteredSeconds}")
    }

    println("Время вышло")
}