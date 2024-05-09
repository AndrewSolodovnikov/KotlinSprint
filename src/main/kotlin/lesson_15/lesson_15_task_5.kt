package lesson_15

fun main() {
    val truck = Truck()
    val car = Car()

    truck.loadPassenger(2)
    truck.loadCargo(3)
    truck.loadPassenger(1)
    truck.unloadPassenger(1)
    truck.loadCargo(2)
    truck.unloadCargo(2)

    car.loadPassenger(5)
    car.loadPassenger(3)
    car.unloadPassenger(3)
    car.loadPassenger(2)
    car.unloadPassenger(2)
    car.loadCargo(1)
}

abstract class Transport: CargoTransportation, PassengerTransportation {
    private var currentPassengerCount: Int = 0
    private var currentCargoWeight: Int = 0

    override fun loadCargo(cargoWeight: Int) {
        currentCargoWeight += cargoWeight
        println("Загружено груза в автомобиль: $cargoWeight")
    }

    override fun unloadCargo(cargoWeight: Int) {
        println("Выгружено груза: $cargoWeight")
        println("Всего перевезено груза: $currentCargoWeight")
    }

    override fun loadPassenger(passenger: Int) {
        currentPassengerCount += passenger
        println("Посажено пассажиров в автомобиль: $passenger")
    }

    override fun unloadPassenger(passenger: Int) {
        println("Высажено пассажиров: $passenger")
        println("Всего перевезено пассажиров: $currentPassengerCount")
    }
}

interface CargoTransportation {
    fun loadCargo(cargoWeight: Int)
    fun unloadCargo(cargoWeight: Int)
}

interface PassengerTransportation {
    fun loadPassenger(passenger: Int)
    fun unloadPassenger(passenger: Int)
}

class Car : Transport() {
    override fun loadCargo(cargoWeight: Int) {
        println("Легковая машина не перевозит груз")
    }

    override fun loadPassenger(passenger: Int) {
        if (passenger > 3) {
            println("Превышено максимальное количество пассажиров")
            return
        }
        super.loadPassenger(passenger)
    }

    override fun unloadCargo(cargoWeight: Int) {
        println("Легковая машина не перевозит груз")
    }

    override fun unloadPassenger(passenger: Int) {
        super.unloadPassenger(passenger)
    }
}

class Truck : Transport() {
    override fun loadCargo(cargoWeight: Int) {
        if (cargoWeight > 2) {
            println("Превышен максимальный вес груза")
            return
        }
        super.loadCargo(cargoWeight)
    }

    override fun loadPassenger(passenger: Int) {
        if (passenger > 1) {
            println("Превышено количество пассажиров")
            return
        }
        super.loadPassenger(passenger)
    }

    override fun unloadCargo(cargoWeight: Int) {
        super.unloadCargo(cargoWeight)
    }

    override fun unloadPassenger(passenger: Int) {
        super.unloadPassenger(passenger)
    }
}

