package lesson_12

import kotlin.random.Random

fun main() {
    val weatherMethods = WeatherMethods()

    repeat(30) {
        val dayTemperature = (20..30).random()
        val nightTemperature = (10..15).random()
        val precipitation = Random.nextBoolean()
        weatherMethods.addWeather(dayTemperature, nightTemperature, precipitation)
    }

    val averageDayTemperature = weatherMethods.weatherList.map { it.dayTemperature }.average()
    val averageNightTemperature = weatherMethods.weatherList.map { it.nightTemperature }.average()
    val countPrecipitation = weatherMethods.weatherList.count() { it.precipitation }

    println(averageDayTemperature)
    println(averageNightTemperature)
    println(countPrecipitation)
}

class WeatherInformer(val dayTemperature: Int, val nightTemperature: Int, val precipitation: Boolean)

class WeatherMethods {
    val weatherList = mutableListOf<WeatherInformer>()
    fun addWeather(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
        weatherList.add(WeatherInformer(dayTemperature, nightTemperature, precipitation))
    }
}