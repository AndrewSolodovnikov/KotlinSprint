package lesson_8

fun main() {
    val listOfIngredients = arrayOf("картошка", "капуста", "перец", "помидор", "морковь")

    println("Введите искомый ингредиент:")
    val readIngredient = readln()

    var isIngredientInTheList = false
    for (ingredient in listOfIngredients) {
        if (readIngredient == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            isIngredientInTheList = true
            break
        }
    }

    if (!isIngredientInTheList) {
        println("Такого ингредиента в рецепте нет")
    }
}