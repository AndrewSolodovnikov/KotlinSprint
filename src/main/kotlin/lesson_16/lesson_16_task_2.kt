package lesson_16

fun main() {
    val privateCircle = PrivateCircle(3.0)

    println(privateCircle.calculatingCircle())
    println(privateCircle.calculatingArea())
}

class PrivateCircle(private val radius: Double) {
    private val pi = 3.14

    fun calculatingCircle(): Double {
        return 2 * pi * radius
    }

    fun calculatingArea(): Double {
        return pi * radius * radius
    }
}