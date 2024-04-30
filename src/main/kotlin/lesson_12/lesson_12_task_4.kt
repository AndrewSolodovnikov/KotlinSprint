package lesson_12

fun main() {
    println("День 1:")
    val weather1 = WeatherInfo(300, 290, false)
    println("День 2:")
    val weather2 = WeatherInfo(295, 280, true)
}

class WeatherInfo(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
    val kelvinTemperature = 273.15
    var dayTemperatureCelsius: Int = (dayTemperatureKelvin - kelvinTemperature).toInt()
    var nightTemperatureCelsius: Int = (nightTemperatureKelvin - kelvinTemperature).toInt()
    var precipitation: Boolean = precipitation

    init {
        println("Дневная температура: $dayTemperatureCelsius")
        println("Дневная температура: $nightTemperatureCelsius")
        println("Сегодня ожидается дождь: ${if (precipitation) "да" else "нет"}")
    }
}