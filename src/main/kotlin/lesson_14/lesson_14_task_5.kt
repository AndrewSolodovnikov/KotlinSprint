package lesson_14

fun main() {
    val chat = Chat()

    chat.addMessage("Маяковский", "Я достаю из широких штанин...")
    chat.addMessage("Пушкин", "У Лукоморья дуб зеленый...")

    chat.addThreadMessage("Пушкин", "Что???", 1)
    chat.addThreadMessage("Лев Толстой", "Отличный слог!", 2)
    chat.addThreadMessage("Пушкин", "Спасибо=)", 2)

    chat.printChat()
}

class Chat {
    val messageList = mutableListOf<Message>()

    fun addMessage(nickName: String, message: String) {
        val messageId = messageList.size + 1
        messageList.add(Message(messageId, nickName, message, null))
    }

    fun addThreadMessage(nickName: String, message: String, parentMessageId: Int) {
        val messageId = messageList.size + 1
        messageList.add(Message(messageId, nickName, message, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messageList.groupBy { it.parentMessageId }
        printMessagesTab(groupedMessages, null)
    }

    private fun printMessagesTab(groupedMessages: Map<Int?, List<Message>>, parentId: Int?) {
        val messages = groupedMessages[parentId]
        if (messages != null) {
            for (message in messages) {
                if (message.parentMessageId == null) {
                    println("${message.nickName}: ${message.message}")
                } else {
                    println("\t ${message.nickName}: ${message.message}")
                }
                printMessagesTab(groupedMessages, message.messageId)
            }
        }
    }
}

data class Message(val messageId: Int, val nickName: String, val message: String, val parentMessageId: Int?)
