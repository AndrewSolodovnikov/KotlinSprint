package lesson_6

fun main() {
    println("Регистрация нового пользователя")
    println("Введите свой логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    while (true) {
        println("Вход в аккаунт")
        println("Введите свой логин:")
        val enterLogin = readln()
        println("Введите свой пароль:")
        val enterPassword = readln()

        if (login == enterLogin && password == enterPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Данные неверны. Введите логин и пароль снова!")
            println()
        }
    }

}