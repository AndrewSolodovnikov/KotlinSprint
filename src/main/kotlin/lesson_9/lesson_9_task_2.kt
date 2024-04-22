package lesson_9

fun main() {
    var listOfIngredients = mutableListOf<String>("картошка", "капуста", "перец")

    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach { println(it) }

    var isAddNewIngredient = true
    while (isAddNewIngredient) {
        println("Желаете добавить еще? (да/нет)")
        val yourAnswer = readln()
        if (yourAnswer == "да") {
            println("Введите дополнительный ингредиент:")
            listOfIngredients.add(readln())
        } else {
            isAddNewIngredient = false
        }
    }

    println("Теперь в рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach{ println(it) }
}