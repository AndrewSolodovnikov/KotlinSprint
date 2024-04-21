package lesson_9
fun main() {
    var numberOfIngredient = 5
    var setOfIngredients = mutableSetOf<String>()

    while (setOfIngredients.size < numberOfIngredient) {
        println("Введите ингредиент:")
        setOfIngredients.add(readln())
    }

    val sortedIngredient = setOfIngredients.sorted()
    val firstIngredient = sortedIngredient[0].capitalize()

    println("Список введенных ингредиентов:")
    println(firstIngredient + ", " + setOfIngredients.drop(1).joinToString(", "))
}