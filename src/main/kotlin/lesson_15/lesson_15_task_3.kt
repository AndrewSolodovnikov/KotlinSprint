package lesson_15

fun main() {
    val standartUser = StandartUser("Альберт")
    val administrator = Administrator("Модест")

    standartUser.readingForum()
    standartUser.writingMessage()

    administrator.readingForum()
    administrator.writingMessage()
    administrator.deleteMessage()
    administrator.deleteUser()
}

abstract class User(val username: String) {
    abstract fun readingForum()

    abstract fun writingMessage()
}

class StandartUser(username: String) :
    User(username) {
    override fun readingForum() {
        println("$username читает форум")
    }

    override fun writingMessage() {
        println("$username пишет сообщение")
    }

}

class Administrator(username: String) : User(username) {
    override fun readingForum() {
        println("Администратор $username читает форум")
    }

    override fun writingMessage() {
        println("Администратор $username пишет на форуме")
    }

    fun deleteMessage() {
        println("Администратор $username удалил сообщение")
    }

    fun deleteUser() {
        println("Администратор $username удалил пользователя")
    }
}