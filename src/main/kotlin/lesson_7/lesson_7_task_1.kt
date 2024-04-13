package lesson_7

const val CHARACTERS_IN_PASSWORD = 6

fun main() {
    var generatedPassword = ""
    for (character in 1..CHARACTERS_IN_PASSWORD) {
        if (character % 2 == 0) {
            val number = (1..9).random()
            generatedPassword = generatedPassword.plus(number)
        } else {
            val letter = ('a'..'z').random()
            generatedPassword = generatedPassword.plus(letter)
        }
    }

    println(generatedPassword)
}