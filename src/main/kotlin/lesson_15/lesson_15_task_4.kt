package lesson_15

fun main() {
    val musicalInstrument = MusicalInstrument("Гитара")
    val accessories = Accessories("Струны")

    musicalInstrument.search()
    accessories.search()
}

interface SearchProduct {
    fun search()
}
class MusicalInstrument(val name: String) : SearchProduct {
    override fun search() {
        println("Выполняется поиск инструмента: $name")
    }

}

class Accessories(val name: String) : SearchProduct {
    override fun search() {
        println("Выполняется поиск аксессуара: $name")
    }

}