package lesson_19

fun main() {
    val product1 = Product("Джинсы", 1, Category.CLOTHES.getCategoryName())
    val product2 = Product("Ручка", 2, Category.OFFICE_SUPPLIES.getCategoryName())
    val product3 = Product("Спички", 3, Category.OTHER.getCategoryName())

    product1.productInfo()
    product2.productInfo()
    product3.productInfo()
}

enum class Category(private val category: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Офисные товары"),
    OTHER("Разное");

    fun getCategoryName(): String { return category }
}

class Product(val name: String, private val id: Int, private val category: String) {
    fun productInfo() {
        println("Товар $name с ID $id находится в категории $category")
    }
}