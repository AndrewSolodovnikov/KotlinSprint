package lesson_2

fun main() {
    val hour = 9
    val minute = 39
    val travelTime = 457

    val departureTime = hour * 60 + minute

    val arrivalHour = (departureTime + travelTime) / 60
    val arrivalMinute = (departureTime + travelTime) % 60

    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}