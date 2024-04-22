package lesson_10

fun main() {
    val moveHuman = randomNumber1()
    val movePC = randomNumber1()

    println("Ход человека: $moveHuman")
    println("Ход машины: $movePC")

    if (moveHuman > movePC) {
        println("Победил человек")
    } else if (moveHuman < movePC) {
        println("Победила машина")
    } else {
        println("У вас ничья")
    }
}

fun randomNumber1(): Int = (1..6).random()