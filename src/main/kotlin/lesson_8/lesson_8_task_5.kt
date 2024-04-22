package lesson_8

fun main() {
    println("Какое количество ингредиентов необходимо ввести:")
    val numbersIngredients = readln().toInt()

    val arrayIngredients: Array<String?> = arrayOfNulls<String>(numbersIngredients)
    for (ingredient in 0..<numbersIngredients) {
        println("Введите ингредиент:")
        arrayIngredients[ingredient] = readln()
    }

    println("Список ваших ингредиентов:")
    for (ingredient in arrayIngredients) {
        println(ingredient)
    }
}