package lesson_19

fun main() {
    val tank = Tank()

    tank.makeShot()
    tank.reloadWeapon(Patron.BLUE)
    tank.makeShot()
    tank.reloadWeapon(Patron.GREEN)
    tank.makeShot()
    tank.reloadWeapon(Patron.RED)
    tank.makeShot()
}

class Tank {
    private var currentPatron: Patron? = null
    fun reloadWeapon(patron: Patron) {
        currentPatron = patron
        println("Танк заряжен патронами с силой удара: ${currentPatron!!.impactForce}")
    }

    fun makeShot() {
        if (currentPatron !== null) {
            println("Танк совершил выстрел с силой удара: ${currentPatron!!.impactForce}")
        } else {
            println("Танк не заряжен!!! Зарядите танк перед выстрелом!")
        }
    }
}

enum class Patron(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}