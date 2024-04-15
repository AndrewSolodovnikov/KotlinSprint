package lesson_8

fun main() {
    val listOfIngredients = arrayOf("картошка", "капуста", "перец", "помидор", "морковь")

    for (ingredient in listOfIngredients) {
        println(ingredient)
    }

    println("Какой ингредиент хотите заменить?")
    val replaceableIngredient = readln()
    if (listOfIngredients.contains(replaceableIngredient)) {
        println("Введите ингредиент который хотите добавить:")
        val newIngredient = readln()

        val indexIngredient = listOfIngredients.indexOf(replaceableIngredient)
        listOfIngredients[indexIngredient] = newIngredient
    } else {
        println("Введенный ингредиент отсутствует")
    }

    println("Готово! Вы сохранили следующий список: " + listOfIngredients.joinToString())

}