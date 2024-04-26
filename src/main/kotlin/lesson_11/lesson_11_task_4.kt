package lesson_11

fun main() {
    val category = Category("Бургеры", "image.jpg", mutableListOf())
    val reciep = Reciep("Жирный бургер", "image1.jpg", false, 1, mutableListOf())

    category.addSubcategory(Subcategory("Сочные бургеры", "image2.jpg", "Самые сочные бургеры"))
    category.addSubcategory(Subcategory("Бургеры с курицей", "image2.jpg", "Бургеры с оболденной курочкой"))

    reciep.addReciep(Ingredients("Булочка", 1, "шт."))
    reciep.addReciep(Ingredients("Котлета", 1, "шт."))
    reciep.addReciep(Ingredients("Сыр", 100, "гр."))
}

class Category(val title: String, val image: String, val subcategoryList: MutableList<Subcategory>){
    fun addSubcategory(subcategory: Subcategory) {
        subcategoryList.add(subcategory)
    }
}

class Reciep(val title: String, val image: String, var like: Boolean, var numberOfIngredients: Int,
             val ingredientsList: MutableList<Ingredients>) {
    fun addReciep(ingredients: Ingredients) {
        ingredientsList.add(ingredients)
    }
}

class Subcategory(val title: String, val image: String, val description: String)

class Ingredients(val ingredient: String, val number: Int, val unit: String)