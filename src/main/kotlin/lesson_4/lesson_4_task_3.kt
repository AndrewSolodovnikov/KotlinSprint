package lesson_4

const val IS_SUNNY: Boolean = true
const val IS_OUTDOOR_AWNING: Boolean = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"
fun main() {
    val isSunnyNow: Boolean = true
    val isOutdoorAwningNow: Boolean = true
    val airHumidityNow = 20
    val seasonNow = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${IS_SUNNY == isSunnyNow && IS_OUTDOOR_AWNING == isOutdoorAwningNow && 
                    AIR_HUMIDITY == airHumidityNow && SEASON !== seasonNow}")
}