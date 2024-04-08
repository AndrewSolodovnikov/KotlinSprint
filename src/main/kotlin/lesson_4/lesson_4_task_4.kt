package lesson_4

fun main() {
    val currentDay = 5
    val trainingArmAndAbs = currentDay % 2 == 1
    val trainingLegAndBack = currentDay % 2 == 0

    println("""
        Упражнения для рук:    $trainingArmAndAbs
        Упражнения для ног:    $trainingLegAndBack
        Упражнения для спины:  $trainingLegAndBack
        Упражнения для пресса: $trainingArmAndAbs
    """.trimIndent())
}