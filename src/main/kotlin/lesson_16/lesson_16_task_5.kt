package lesson_16

const val MAX_HEALTH = 100
fun main() {
    val gladiator = Gladiator("Галилей")

    gladiator.damage()
    gladiator.treatment()
    gladiator.treatment()
    gladiator.damage()
    gladiator.damage()
    gladiator.damage()
    gladiator.damage()
}

class Gladiator(val name: String) {
    private var health: Int = MAX_HEALTH
    private var impactForce: Int = randomNumberGenerator()

    private fun randomNumberGenerator(): Int {
        return (30..60).random()
    }

    private fun randomDamage(): Int {
        return randomNumberGenerator()
    }

    private fun randomTreatment(): Int {
        return randomNumberGenerator()
    }

    private fun death() {
        println("Гладиатор $name повержен")
        health = 0
        impactForce = 0
    }

    fun damage() {
        if (health > 0) {
            health -= randomDamage()
            if (health <= 0) {
                death()
            } else {
                println("-- нанесен урон, текущее здоровье $health %")
            }
        } else {
            println("Гладиатор $name уже повержен, прекрати над ним издеваться")
        }
    }

    fun treatment() {
        if (health > 0 ) {
            health += randomTreatment()
            if (health > MAX_HEALTH) health = MAX_HEALTH
            println("++ вы поправили здоровье, теперь оно составляет $health %")
        } else {
            println("Вы не можете восстановить здоровье гладиатора, он был убит")
        }
    }
}