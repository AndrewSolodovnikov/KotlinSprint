package lesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesBookedToday < NUMBER_OF_TABLES} \n" +
            "Доступность столиков на завтра: ${tablesBookedTomorrow < NUMBER_OF_TABLES}")
}