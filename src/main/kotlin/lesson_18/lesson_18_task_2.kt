package lesson_18

fun main() {
    val dice = listOf<Dice>(Dice4(), Dice6(), Dice8())

    dice.forEach { println(it.rollDice()) }
}

open class Dice(private val sides: Int) {
    open fun rollDice(): Int {
        return (1..sides).random()
    }
}

class Dice4(): Dice(4)
class Dice6(): Dice(6)
class Dice8(): Dice(8)
