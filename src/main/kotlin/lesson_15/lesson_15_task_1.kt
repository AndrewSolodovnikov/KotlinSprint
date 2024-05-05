package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}

interface Flying {
    fun fly()
}

interface Swiming {
    fun swim()
}

class Crucian : Swiming {
    override fun swim() {
        println("Карась может плавать")
    }

}

class Seagull : Flying, Swiming {
    override fun fly() {
        println("Чайка может лететь")
    }

    override fun swim() {
        println("Чайка может сидеть на воде")
    }

}

class Duck : Swiming, Flying {
    override fun fly() {
        println("Утка может летать")
    }

    override fun swim() {
        println("Утка хорошо плавает на воде")
    }
}