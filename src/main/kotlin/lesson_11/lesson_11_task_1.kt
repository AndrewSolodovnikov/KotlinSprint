package lesson_11

fun main() {
    val user1 = User(1111, "admin", "qwerty", "aaa@mail.ru")
    val user2 = User(2222, "user", "rdxzse", "zzz@mail.ru")

    println("Данные первого пользователя:")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println("Данные второго пользователя:")
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}

class User(val id: Int, val login: String, val password: String, val email: String)