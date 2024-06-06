package lesson_21

fun main() {
    val skillsMap = mapOf<String, Int>("Сила" to 70, "Скорость" to 50, "Прыжок" to 60, "Разум" to 70)

    println(skillsMap.maxCategory().key)
}

fun Map<String, Int>.maxCategory(): Map.Entry<String, Int> {
    return this.maxBy { it.value }
}
