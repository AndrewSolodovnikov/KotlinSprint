package lesson_16

fun main() {
    val gladiator = Gladiator()

    gladiator.damage()
    gladiator.treatment()
    gladiator.damage()
    gladiator.damage()
    gladiator.damage()
}

class Gladiator {
    private val name: String = "Галилей"
    private var health: Int = 90
    private var impactForce: Int = 40

    fun damage() {
        if (health > 0) {
            health -= 60
            if (health <= 0) {
                println("Гладиатор $name повержен")
                health = 0
                impactForce = 0
            } else {
                println("-- нанесен урон, текущее здоровье $health %")
            }
        } else {
            println("Гладиатор $name уже повержен, прекрати над ним издеваться")
        }
    }

    fun treatment() {
        if (health > 0 ) {
            health += 40
            println("++ вы поправили здоровье, теперь оно составляет $health %")
            if (health > 100) health = 100
        } else {
            println("Вы не можете восстановить здоровье гладиатора, он был убит")
        }
    }
}