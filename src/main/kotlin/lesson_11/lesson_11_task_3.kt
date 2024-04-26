package lesson_11

fun main() {
    val room = ChatRoom("cover.jpg", "Флудилка")
    room.addParticipants(Participants("user1", "avatar1.jpg", "разговаривает"))
    room.addParticipants(Participants("user2", "avatar2.jpg", "микрофон выключен"))
    room.addParticipants(Participants("user3", "avatar3.jpg", "пользователь заглушен"))

    room.statusUpdate("user1", "микрофон выключен")
    room.printUserInfo("user1")
    room.printUserInfo("user2")
}

class ChatRoom(val cover: String,
               val title: String,
               val participantsList: MutableList<Participants> = mutableListOf()) {
    fun addParticipants(user: Participants) {
        participantsList.add(user)
    }

    fun statusUpdate(login: String, status: String) {
        val participant = participantsList.find { it.login == login }
        participant?.status = status
    }

    fun printUserInfo(login: String) {
        val participant = participantsList.find { it.login == login }
        println(participant?.login)
        println(participant?.status)
    }

}

class Participants(val login: String, val avatar: String, var status: String)