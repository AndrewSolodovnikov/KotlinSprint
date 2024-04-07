package lesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    var tablesBookedToday = 13
    var tablesBookedTomorrow = 9
    var table: Boolean = true

    println("Доступность столиков на сегодня: ${tablesBookedToday < NUMBER_OF_TABLES} \n" +
            "Доступность столиков на завтра: ${tablesBookedTomorrow < NUMBER_OF_TABLES}")
}