package lesson_9
fun main() {
    var numberOfIngredient = 5
    var listOfIngredients = mutableListOf<String>()

    while (numberOfIngredient > 0) {
        println("Введите ингредиент:")
        val newIngredient = readln()
        if (listOfIngredients.contains(newIngredient)) {
            continue
        } else {
            listOfIngredients.add(newIngredient)
            numberOfIngredient--
        }
    }

    println("Список введенных ингредиентов:")
    println(listOfIngredients.joinToString(", "))
}