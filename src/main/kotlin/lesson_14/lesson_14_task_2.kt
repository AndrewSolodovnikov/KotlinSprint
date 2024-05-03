package lesson_14

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.loadingOfCargo()
    cargoShip.loadingOfCargo()
    icebreaker.loadingOfCargo()
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

    open fun loadingOfCargo() {
        println("$name выдвигает горизонтальный трап со шкафута")
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

    override fun loadingOfCargo() {
        println("$name активирует погрузочный кран")
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

    override fun loadingOfCargo() {
        println("$name открывает ворота со стороны кормы")
    }
}