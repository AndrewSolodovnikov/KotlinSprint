package lesson_4

const val IS_NO_DAMAGE = true
const val PROVISION = 50
var isWeatherFavorable = true || false
val numberOfCrew = 55..70

fun main() {
    println("На коробле нет повреждений? (true/false)")
    val readDamage = readln().toBoolean()

    println("Сколько экипажа на корабле?")
    val readNumbersCrew = readln().toInt()

    println("Сколько провизии на корабле?")
    val readProvision = readln().toInt()

    println("Хорошая погода? (true/false)")
    val readWeather = readln().toBoolean()

    println(IS_NO_DAMAGE == readDamage && PROVISION <= readProvision && readNumbersCrew in numberOfCrew && isWeatherFavorable == readWeather)
}