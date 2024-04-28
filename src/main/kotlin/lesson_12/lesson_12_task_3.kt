package lesson_12

fun main() {
    val weather1 = WeatherInfo(300,290,false)
    val weather2 = WeatherInfo(295, 280, true)

    println("День 1:")
    weather1.printWeather()
    println("День 2:")
    weather2.printWeather()
}

class WeatherInfo(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
    val kelvinTemperature = 273.15
    var dayTemperatureCelsius: Int = (dayTemperatureKelvin - kelvinTemperature).toInt()
    var nightTemperatureCelsius: Int = (nightTemperatureKelvin - kelvinTemperature).toInt()
    var precipitation: Boolean = precipitation

    fun printWeather() {
        println("Дневная температура: $dayTemperatureCelsius")
        println("Дневная температура: $nightTemperatureCelsius")
        println("Сегодня ожидается дождь: ${if (precipitation) "да" else "нет"}")
    }
}