package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.movements()
    seagull.movements()
    duck.movements()
}

interface Animal {
    fun movements()
}

class Crucian : Animal {
    override fun movements() {
        println("Карась плывет")
    }
}

class Seagull : Animal {
    override fun movements() {
        println("Чайка может летать, ходить и сидеть на воде")
    }
}
class Duck : Animal {
    override fun movements() {
        println("Утка может летать, ходить и сидеть на воде")
    }

}