package lesson_11

fun main() {
    val forumFactory = SimpleForumFactory()
    val forum = Forum(forumFactory)

    val user1 = forum.createNewUser("Алина")
    val user2 = forum.createNewUser("Борис")

    forum.createNewMessage(user1.userId, "Привет, Борис =)")
    forum.createNewMessage(user2.userId, "Привет, Алина ;)")

    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Всё отлично))")

    forum.printThread()
}

interface ForumFactory {
    fun createUser(userName: String): ForumUser
    fun createMessage(authorId: Int, messageText: String): ForumMessage
}

class SimpleForumFactory : ForumFactory {
    private var userIdCounter = 1

    override fun createUser(userName: String): ForumUser {
        return ForumUser(userIdCounter++, userName)
    }

    override fun createMessage(authorId: Int, messageText: String): ForumMessage {
        return ForumMessage(authorId, messageText)
    }
}

class ForumUser(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)

class Forum(private val factory: ForumFactory) {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumUser {
        val newUser = factory.createUser(userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, messageText: String) {
        val userExists = users.firstOrNull { it.userId == authorId } != null
        if (userExists) {
            val newMessage = factory.createMessage(authorId, messageText)
            messages.add(newMessage)
        } else {
            println("Пользователь с Id $authorId не найден")
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val authorName = users.find { it.userId == message.authorId }?.userName ?: "Неизвестный пользователь"
            println("$authorName: ${message.message}")
        }
    }
}