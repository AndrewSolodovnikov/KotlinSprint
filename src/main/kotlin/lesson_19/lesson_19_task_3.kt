package lesson_19

fun main() {
    val spiceShip = SpiceShip()

    spiceShip.fly()
    spiceShip.landing()
    spiceShip.shootBack()
}

class SpiceShip {
    fun fly() {
        TODO("Функция не реализована")
    }

    fun landing() {
        // TODO доделать, функция еще не реализована
    }

    fun shootBack() {
        throw NotImplementedError("Функция еще не реализована")
    }
}