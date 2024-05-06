package lesson_15

fun main() {
    val weatherServer = WeatherServer()
    val data1 = Temperature(22.8)
    val data2 = PrecipitationAmount(2.3)

    weatherServer.sendData(data1)
    weatherServer.sendData(data2)
}

abstract class WeatherStationStats(val value: Double)

class Temperature(value: Double) : WeatherStationStats(value)

class PrecipitationAmount(value: Double) : WeatherStationStats(value)

class WeatherServer() {
    fun sendData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> sendTemperature(data.value)
            is PrecipitationAmount -> sendPrecipitation(data.value)
        }
    }

    fun sendTemperature(data: Double) {
        println("Температура: $data C")
    }

    fun sendPrecipitation(data: Double) {
        println("Количество осадков: $data мм")
    }
}