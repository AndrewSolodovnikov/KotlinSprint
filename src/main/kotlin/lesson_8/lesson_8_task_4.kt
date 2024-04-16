package lesson_8

fun main() {
    val listOfIngredients = arrayOf("картошка", "капуста", "перец", "помидор", "морковь")

    for (ingredient in listOfIngredients) {
        println(ingredient)
    }

    println("Какой ингредиент хотите заменить?")
    val replaceableIngredient = readln()

    val indexIngredient = listOfIngredients.indexOf(replaceableIngredient)

    if (indexIngredient !== -1) {
        println("Введите ингредиент который хотите добавить:")
        val newIngredient = readln()
        listOfIngredients[indexIngredient] = newIngredient
    } else {
        println("Введенный ингредиент отсутствует")
    }

    println("Готово! Вы сохранили следующий список: " + listOfIngredients.joinToString())

}