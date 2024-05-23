package lesson_16

fun main() {
    val onlineOrdering = OnlineOrder("000132457")

    onlineOrdering.orderModification(true)
    onlineOrdering.printStatus()
}

class OnlineOrder(val orderNumber: String, private var isOrderReady: Boolean = false) {

    private fun changeOrderStatus(status: Boolean) {
        isOrderReady = status
    }

    fun orderModification(status: Boolean) {
        changeOrderStatus(status)
    }

    fun printStatus() {
        println(isOrderReady)
    }
}