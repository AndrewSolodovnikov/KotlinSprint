package lesson_14

fun main() {
    val liner = Liner2()
    val cargoShip = CargoShip2()
    val icebreaker = Icebreaker2()

    liner.printShip()
    cargoShip.printShip()
    icebreaker.printShip()
}

open class Liner2(
    val name: String = "Лайнер",
    val speed: Int = 30,
    val cargoHandling: Int = 10,
    val passenger: Int = 200,
) {
    open fun printShip() {
        println(
            "$name отправляется со скоростью $speed узлов, " +
                    "грузом $cargoHandling и колличеством пассажиров $passenger человек"
        )
    }
}

class CargoShip2(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    cargoHandling: Int = 100,
    passenger: Int = 20,
) : Liner2(name, speed, cargoHandling, passenger) {
    override fun printShip() {
        super.printShip()
    }
}

class Icebreaker2(
    name: String = "Ледокол",
    speed: Int = 10,
    cargoHandling: Int = 5,
    passenger: Int = 10,
    isIcebreaker: Boolean = true,
): Liner2(name, speed, cargoHandling, passenger) {
    override fun printShip() {
        super.printShip()
    }
}