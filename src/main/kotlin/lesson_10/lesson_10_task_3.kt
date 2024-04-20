package lesson_10

import java.lang.StringBuilder

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()

    println(generatePassword(passwordLength))
}

fun generatePassword(length: Int): StringBuilder {
    val numbers = 1..9
    val characters = "!\"#\$%&'()*+,-./ "
    val password = StringBuilder()

    for (i in 1..length) {
        if (i % 2 == 0) {
            val index = (0..15).random()
            val symbol = characters[index]
            password.append(symbol)
        } else {
            val symbol = (numbers).random().toString()
            password.append(symbol)
        }
    }

    return password
}