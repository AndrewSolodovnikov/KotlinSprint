package lesson_12

fun main() {
    val weather1 = WeatherForecast(22,12,false)
    val weather2 = WeatherForecast(16, 12, true)

    println("День 1:")
    weather1.printWeather()
    println("День 2:")
    weather2.printWeather()
}

class WeatherForecast(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    var dayTemperature: Int = dayTemperature
    var nightTemperature: Int = nightTemperature
    var precipitation: Boolean = precipitation

    fun printWeather() {
        println("Дневная температура: $dayTemperature")
        println("Дневная температура: $nightTemperature")
        println("Сегодня ожидается дождь: ${if (precipitation) "да" else "нет"}")
    }
}