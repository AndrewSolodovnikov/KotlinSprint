package lesson_14

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.printShip()
    cargoShip.printShip()
    icebreaker.printShip()
}

open class Liner(
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

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    cargoHandling: Int = 100,
    passenger: Int = 20,
) : Liner(name, speed, cargoHandling, passenger) {
    override fun printShip() {
        super.printShip()
    }
}

class Icebreaker(
    name: String = "Ледокол",
    speed: Int = 10,
    cargoHandling: Int = 5,
    passenger: Int = 10,
    isIcebreaker: Boolean = true,
): Liner(name, speed, cargoHandling, passenger) {
    override fun printShip() {
        super.printShip()
    }
}