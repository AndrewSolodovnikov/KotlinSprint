package lesson_16

fun main() {
    val privateCube = PrivateCube()

    println(privateCube.getNumber)
}

class PrivateCube {
    private val number = (1..6).random()

    val getNumber = number
}