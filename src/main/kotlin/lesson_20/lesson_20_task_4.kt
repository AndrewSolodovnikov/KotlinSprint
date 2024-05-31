package lesson_20

fun main() {
    val elementsList =
        listOf<String>("нулевой", "первый", "второй", "третий", "четвертый", "пятый", "шестой", "седьмой")

    val printElement = elementsList.map { element -> { println("Нажат $element элемент") } }

    printElement.forEachIndexed { index, element ->
        if (index % 2 == 0) {
            element()
        }
    }
}