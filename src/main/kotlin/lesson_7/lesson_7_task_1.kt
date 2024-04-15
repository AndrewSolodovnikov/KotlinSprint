package lesson_7

const val CHARACTERS_IN_PASSWORD = 6

fun main() {
    var generatedPassword = ""
    val rangeNumbers = 1..9
    val rangeLetters = 'a'..'z'

    for (character in 1..CHARACTERS_IN_PASSWORD) {
        if (character % 2 == 0) {
            val number = (rangeNumbers).random()
            generatedPassword = generatedPassword.plus(number)
        } else {
            val letter = (rangeLetters).random()
            generatedPassword = generatedPassword.plus(letter)
        }
    }

    println(generatedPassword)
}