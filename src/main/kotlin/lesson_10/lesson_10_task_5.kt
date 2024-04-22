package lesson_10

const val LENGTH_TOKEN = 32
fun main() {
    val login = "user"
    val password = "pass123"
    val cart = mutableListOf<String>("клавиатура", "мышь", "монитор", "системный блок", "колонки")

    if (userLogin(login, password) != null) {
        println("В вашей корзине: " + cart.joinToString(", "))
    } else {
        println("Логин или пароль введены неверно")
    }
}

fun generateToken(): String {
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val numbers = '0'..'9'

    var token = ""

    for (char in 1..LENGTH_TOKEN) {
        when ((1..3).random()) {
            1 -> token += lowercaseLetters.random()
            2 -> token += uppercaseLetters.random()
            3 -> token += numbers.random()
        }
    }

    return token
}

fun userLogin(login: String, password: String): String? {
    println("Введите логин:")
    val enteredLogin = readln()
    println("Введите пароль:")
    val enteredPassword = readln()

    if (enteredLogin == login && enteredPassword == password) {
        return generateToken()
    } else {
        return null
    }
}