package lesson_16

fun main() {
    val onlineOrdering = OnlineOrdering()

    onlineOrdering.changeOrderStatus(true)
    onlineOrdering.printStatus()
}

class OnlineOrdering {
    private val numberOrdering = "000132457"
    private var isOrderReady = false

    fun changeOrderStatus(status: Boolean) {
        isOrderReady = status
    }

    fun printStatus() {
        println(isOrderReady)
    }
}