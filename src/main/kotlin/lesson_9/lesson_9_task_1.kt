package lesson_9

fun main() {
    val listOfIngredients = listOf("картошка", "капуста", "перец", "помидор", "морковь")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { println(it) }
}