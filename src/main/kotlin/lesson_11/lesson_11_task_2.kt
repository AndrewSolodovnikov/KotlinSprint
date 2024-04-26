package lesson_11

fun main() {
    val user1 = UserClass(1111, "admin", "qwerty", "aaa@mail.ru", "")

    user1.enteredBio()
    user1.changePassword()
    user1.print()
}

class UserClass(val id: Int, val login: String, var password: String, val email: String, var bio: String = "") {
    fun print() {
        println("ID: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("email: $email")
        println("Биография: $bio")
    }

    fun enteredBio() {
        println("Введите биографию:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите свой пароль:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен на новый")
        }
    }
}