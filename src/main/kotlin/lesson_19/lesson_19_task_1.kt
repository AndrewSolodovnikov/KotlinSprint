package lesson_19

fun main() {
    for (i in Fish.entries) {
        println(i.nameFish)
    }
}

enum class Fish(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}