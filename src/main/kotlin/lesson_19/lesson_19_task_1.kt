package lesson_19

fun main() {
    val fishNumberList = listOf<Int>(1, 2, 3, 4)

    for (i in fishNumberList) {
        when(i) {
            1 -> getFish(Fish.GUPPY)
            2 -> getFish(Fish.ANGELFISH)
            3 -> getFish(Fish.GOLDFISH)
            4 -> getFish(Fish.SIAMESE_FIGHTING_FISH)
        }
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun getFish(fish: Fish) {
    when(fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}