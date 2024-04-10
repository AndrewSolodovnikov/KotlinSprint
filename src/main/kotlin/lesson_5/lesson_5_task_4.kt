package lesson_5

fun main() {
    val userName = "Zaphod"
    val password = "PanGalactic"

    print("Введите логин: ")
    val login = readln()
    if (userName == login) {
        print("Введите пароль: ")
        val entredPassword = readln()
        if (password == entredPassword) {
            println("Космический корабль \"Heart of Gold\" приветствует вас!")
        } else {
            println("Пароль не верен")
        }
    } else {
        println("Вы не зарегистрированны на корабле, прошу пройти регистрацию")
    }
}