package lesson_9

fun main() {
    val listIngredients = listOf<Int>(2,50,15)
    println("Введите количество порций:")
    val numberOfServings = readln().toInt()

    val newListIngredients = listIngredients.map { numberOfServings * it }
    println("На $numberOfServings порций вам понадобится: Яиц – ${newListIngredients[0]}, " +
            "молока – ${newListIngredients[1]}, сливочного масла – ${newListIngredients[2]}")
}