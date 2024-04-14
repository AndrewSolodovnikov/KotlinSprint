package lesson_4

const val IS_NO_DAMAGE = true
const val PROVISION = 50
const val CREW_MIN = 55
const val CREW_MAX = 70
const val GOOD_WEATHER = true

fun main() {
    println("На коробле нет повреждений? (true/false)")
    val readDamage = readln().toBoolean()

    println("Сколько экипажа на корабле?")
    val readNumbersCrew = readln().toInt()

    println("Сколько провизии на корабле?")
    val readProvision = readln().toInt()

    println("Погода благоприятная или неблагоприятная? (true/false)")
    val readWeather = readln().toBoolean()

    println(
        (IS_NO_DAMAGE == readDamage &&
                PROVISION <= readProvision &&
                readNumbersCrew in CREW_MIN..CREW_MAX) ||
                (!IS_NO_DAMAGE == readDamage &&
                        PROVISION >= 50 &&
                        CREW_MAX == readNumbersCrew &&
                        GOOD_WEATHER == readWeather)
    )
}