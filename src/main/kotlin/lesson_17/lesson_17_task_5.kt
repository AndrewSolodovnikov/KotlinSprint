package lesson_17

fun main() {
    val client = Client("Maks", "12345")

    client.passwordActions = "qwerty"
    println(client.passwordActions)
    client.newLogin = "Serega"
}

class Client(private var login: String, private var password: String) {
    var passwordActions: String = password
        set(value) {
            println("Вы не можете изменить пароль")
            field = field
        }
        get() {
            return "*".repeat(password.length)
        }

    var newLogin: String = login
        set(value) {
            field = value
            println("Логин успешно изменен на $field")
        }
}