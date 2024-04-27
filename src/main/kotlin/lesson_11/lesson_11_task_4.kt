package lesson_11

fun main() {
    val category = Category("Бургеры", "image.jpg", mutableListOf())
    val recipe = Recipe("Жирный бургер", "image1.jpg", false, 1, mutableListOf())

    category.addRecipe(Recipe("Сочные бургеры", "image2.jpg", false, 1, mutableListOf()))
    category.addRecipe(Recipe("Бургеры с курицей", "image2.jpg", false, 1, mutableListOf()))

    recipe.addIngredient(Ingredient("Булочка", 1, "шт."))
    recipe.addIngredient(Ingredient("Котлета", 1, "шт."))
    recipe.addIngredient(Ingredient("Сыр", 100, "гр."))
}

class Category(val title: String, val image: String, val recipeList: MutableList<Recipe>){
    fun addRecipe(recipe: Recipe) {
        recipeList.add(recipe)
    }
}

class Recipe(val title: String, val image: String, var like: Boolean, var numberOfIngredients: Int,
             val ingredientsList: MutableList<Ingredient>) {
    fun addIngredient(ingredient: Ingredient) {
        ingredientsList.add(ingredient)
    }
}

class Ingredient(val ingredient: String, val number: Int, val unit: String)