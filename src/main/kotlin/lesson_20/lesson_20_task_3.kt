package lesson_20

fun main() {
    val checkKey: (MyPlayer) -> Unit = { myPlayer: MyPlayer ->
        if (myPlayer.hasKey) println("Дверь открыта") else println("Дверь закрыта")
    }

    val myPlayer1 = MyPlayer("Антон", true)
    val myPlayer2 = MyPlayer("Георгий", false)

    checkKey(myPlayer1)
    checkKey(myPlayer2)
}

class MyPlayer(val name: String, var hasKey: Boolean)