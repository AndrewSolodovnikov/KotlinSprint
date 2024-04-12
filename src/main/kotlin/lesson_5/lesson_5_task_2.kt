package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024

fun main() {
    println("Введите ваш год рождения")
    val userBirthYear = readln().toInt()
    val userAge = CURRENT_YEAR - userBirthYear


    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else if (userAge == 16 || userAge == 17) {
        println("Показать экран с ограниченным контентом")
    } else {
        println("Верннуться на главный экран")
    }

}