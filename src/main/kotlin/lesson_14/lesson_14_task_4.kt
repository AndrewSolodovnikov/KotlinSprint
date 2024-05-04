package lesson_14

fun main() {
    val satellitesList = mutableListOf(
        Satellits(name = "Бергамо", atmosphere = true),
        Satellits(name = "Дюно", atmosphere = false)
    )

    val planet = Planet(name = "Галемео", atmosphere = true, satellitesList = satellitesList)

    println("Планета: ${planet.name}")
    println("Количество спутников: ${planet.satellitesList.size}")
    println("Спутники: ${planet.satellitesList.joinToString(", ") { it.name }}")
}

open class CelestialBody(val name: String, val atmosphere: Boolean)

class Planet(name: String, atmosphere: Boolean, val satellitesList: MutableList<Satellits>) :
    CelestialBody(name, atmosphere)

class Satellits(name: String, atmosphere: Boolean) : CelestialBody(name, atmosphere)