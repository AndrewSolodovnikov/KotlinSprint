package lesson_18

fun main() {
    val onlineOrder = OnlineOrder()

    onlineOrder.addOrder("8775689", "fish")
    onlineOrder.addOrder("8775690", listOf("fish", "milk"))
}

class OnlineOrder {
    fun addOrder(
        numberOrder: String,
        item: String,
    ) {
        println("Номер заказа: $numberOrder")
        println("Товар: $item")
    }

    fun addOrder(
        numberOrder: String,
        item: List<String>,
    ) {
        println("Номер заказа: $numberOrder")
        println("Товары: ${item.joinToString(", ")}")
    }
}