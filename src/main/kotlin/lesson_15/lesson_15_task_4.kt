package lesson_15

fun main() {
    val instrument = Instrument("Скрипка")
    val accessories = Accessories("Струны")

    instrument.search()
    accessories.search()
}

interface SearchInstrument {
    fun search()
}

class Instrument (val name: String) : SearchInstrument {
    override fun search() {
        println("Выполняется поиск инструмента: $name")
    }
}

class Accessories (val name: String) : SearchInstrument {
    override fun search() {
        println("Выполняется поиск аксессуара: $name")
    }

}