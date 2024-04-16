package lesson_7

fun main() {
    println("Введите пароль длиной не менее 6 символов:")
    val lengthPassword = readln().toInt()

    val lowercaseLetters = ('a'..'z')
    val uppercaseLetters = ('A'..'Z')
    val numbers = ('0'..'9')

    var password = ""
    if (lengthPassword >= 6) {
        for (char in 1..lengthPassword) {
            when ((1..3).random()) {
                1 -> password += lowercaseLetters.random()
                2 -> password += uppercaseLetters.random()
                3 -> password += numbers.random()
            }
        }
    } else {
        println("Вы ввели число меньше 6")
    }

    println(password)
}