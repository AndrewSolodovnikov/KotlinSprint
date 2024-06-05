package lesson_21

import lesson_20.MAX_HEALTH
import lesson_20.Player

fun main() {
    val player1 = Player("Марио", 50)
    val player2 = Player("Джони", 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}

fun Player.isHealthy(): Boolean {
    return this.currentHealth == MAX_HEALTH
}