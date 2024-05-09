package lesson_15

fun main() {
    val instrument = Instrument("Скрипка")
    val accessories = Accessories("Струны")

    instrument.search(accessories)
}

interface SearchInstrument {
    fun search(accessories: Accessories)
}

open class Product (val name: String)

class Instrument (name: String) : Product(name), SearchInstrument {
    override fun search(accessories: Accessories) {
        println("Выполняется поиск аксесуара \"${accessories.name}\" для инструмента: $name")
    }
}

class Accessories (name: String) : Product(name)