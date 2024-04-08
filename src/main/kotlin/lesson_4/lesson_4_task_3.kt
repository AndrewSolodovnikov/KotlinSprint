package lesson_4

fun main() {
    val sunny: Boolean = true
    val outdoorAwning: Boolean = true
    val airHumidity = 20
    val season = "зима"

    val sunnyNow: Boolean = true
    val outdoorAwningNow: Boolean = true
    val airHumidityNow = 20
    val seasonNow = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${sunny == sunnyNow && outdoorAwning == outdoorAwningNow && 
                    airHumidity == airHumidityNow && season == seasonNow}")
}