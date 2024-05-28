package lesson_20

const val MAX_HEALTH = 100
fun main() {
    val therapeuticPotion: (Player) -> Unit = {player: Player ->
        player.currentHealth = MAX_HEALTH
        println("Здоровье игрока пополнено до ${player.currentHealth}")
    }

    val player = Player("Марио", 30)
    therapeuticPotion(player)
}

class Player(val name: String, var currentHealth: Int, var maxHealth: Int = MAX_HEALTH)