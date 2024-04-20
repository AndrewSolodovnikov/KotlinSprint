package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if (checkValidity(login) ==! true || checkValidity(password) ==! true) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Поздравляем! Вы прошли регистрацию")
    }

}

fun checkValidity(str: String) : Boolean {
    return str.length >= 4
}