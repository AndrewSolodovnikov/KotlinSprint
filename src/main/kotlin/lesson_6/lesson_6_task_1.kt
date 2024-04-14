package lesson_6

fun main() {
    println("Регистрация нового пользователя")
    println("Введите свой логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    do {
        println("Вход в аккаунт")
        println("Введите свой логин:")
        val enterLogin = readln()
        println("Введите свой пароль:")
        val enterPassword = readln()

        var isAuthorization = login == enterLogin && password == enterPassword
        if (isAuthorization) {
            println("Авторизация прошла успешно")
        } else {
            println("Данные неверны. Введите логин и пароль снова!")
            println()
        }
    } while (!isAuthorization)

}