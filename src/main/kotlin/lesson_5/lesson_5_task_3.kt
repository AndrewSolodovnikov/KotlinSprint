package lesson_5

fun main() {
    val winNumber1 = 4
    val winNumber2 = 33

    println("Введите первое число от 0 до 42:")
    val guess1 = readlnOrNull()?.toInt()

    println("Введите первое число от 0 до 42:")
    val guess2 = readlnOrNull()?.toInt()

    if ((guess1 == winNumber1 && guess2 == winNumber2) ||
        (guess1 == winNumber2 && guess2 == winNumber1)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guess1 == winNumber1 || guess1 == winNumber2 ||
        guess2 == winNumber1 || guess2 == winNumber2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Выйгрышные числа были: $winNumber1 и $winNumber2")
}