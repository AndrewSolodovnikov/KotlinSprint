package lesson_22

fun main() {
    val dataUser = DataUser("Алексей", "alex2000", 24)
    val (name, login, age) = dataUser

    println("Клиент: $name\n" +
            "Логин: $login\n" +
            "Возраст: $age")
}

data class DataUser(val name: String, val login: String, val age: Int)