package lesson_8

fun main() {
        val listOfIngredients = arrayOf("картошка", "капуста", "перец", "помидор", "морковь")

        println("Введите искомый ингредиент:")
        val readIngredient = readln()

        if (readIngredient in listOfIngredients) {
            println("Ингредиент $readIngredient в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
        }

}