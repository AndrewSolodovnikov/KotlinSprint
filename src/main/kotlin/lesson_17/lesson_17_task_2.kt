package lesson_17

fun main() {
    val ship = Ship("Александрия", 17.7, "Сочи")

    println("Имя корабля: ${ship.name}")
    println("Средняя скорость: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.homePort}")

    ship.newName = "Титаник"

    println("Проверка имени корабля: ${ship.name}")
}

class Ship(val name: String, var averageSpeed: Double, var homePort: String) {
    var newName: String = name
        set(value) {
            println("Имя корабля нельзя изменить!")
        }
}