package lesson_18

fun main() {
    val animalList = listOf<Animal>(Fox("Лиса"), Dog("Собака"), Cat("Кошка"))

    animalList.forEach { it.eat() }
}

abstract class Animal(val name: String) {
    abstract fun eat()
    abstract fun sleep()
}

class Fox(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }

    override fun sleep() {
        println("$name -> спит")
    }

}

class Dog(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }

    override fun sleep() {
        println("$name -> спит")
    }

}

class Cat(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }

    override fun sleep() {
        println("$name -> спит")
    }

}