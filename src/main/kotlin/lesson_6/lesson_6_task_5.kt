package lesson_6

fun main() {
    var numberOfAttempts = 3

    while (numberOfAttempts > 0) {
        var randomNumberA = (1..9).random()
        var randomNumberB = (1..9).random()

        println("Для авторизации решите пример: $randomNumberA + $randomNumberB")
        println("Ваш ответ:")
        val yourAnswer = readln().toInt()

        if (yourAnswer == randomNumberA + randomNumberB) {
            println("Добро пожаловать!")
            break
        } else {
            println("Ответ не верен, попробуй еще раз!")
            --numberOfAttempts
        }

        if (numberOfAttempts == 0) {
            println("Доступ запрещен")
        }
    }
}