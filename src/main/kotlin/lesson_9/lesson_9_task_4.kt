package lesson_9

fun main() {
    println("Введите ингредиенты через запятую:")
    val enteredIngredients = readln()
    val listIngredients = enteredIngredients.split(", ")
    val sortedIngredients = listIngredients.sorted()

    println(sortedIngredients)
}