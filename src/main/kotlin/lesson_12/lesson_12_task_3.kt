package lesson_12

fun main() {
    val weather1 = WeathersInfo(300,290,false)
    val weather2 = WeathersInfo(295, 280, true)

    println("День 1:")
    weather1.printWeather()
    println("День 2:")
    weather2.printWeather()
}

class WeathersInfo(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
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