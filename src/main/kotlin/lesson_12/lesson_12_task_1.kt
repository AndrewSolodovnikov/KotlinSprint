package lesson_12

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()

    weather1.dayTemperature = 22
    weather1.nightTemperature = 12
    weather1.precipitation = false

    weather2.dayTemperature = 16
    weather2.nightTemperature = 6
    weather2.precipitation = true

    println("День 1:")
    weather1.printWeather()
    println("День 2:")
    weather2.printWeather()
}

class Weather() {
    var dayTemperature: Int = 20
    var nightTemperature: Int = 10
    var precipitation: Boolean = false

    fun printWeather() {
        println("Дневная температура: $dayTemperature")
        println("Дневная температура: $nightTemperature")
        println("Сегодня ожидается дождь: ${if (precipitation) "да" else "нет"}")
    }
}