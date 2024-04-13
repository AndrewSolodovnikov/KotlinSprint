package lesson_4

const val IS_NO_DAMAGE = true
const val PROVISION = 50
val numberOfCrew = 55..70

fun main() {
    println("На коробле нет повреждений? (true/false)")
    val readDamage = readln().toBoolean()

    println("Сколько экипажа на корабле?")
    val readNumbersCrew = readln().toInt()

    println("Сколько провизии на корабле?")
    val readProvision = readln().toInt()

    println(IS_NO_DAMAGE == readDamage &&
            PROVISION <= readProvision &&
            readNumbersCrew in numberOfCrew)
}