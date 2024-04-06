package lesson_2

const val ONE_MINUTE_IN_SECONDS = 60
fun main() {
    val hour = 9
    val minute = 39
    val travelTime = 457

    val departureTime = hour * ONE_MINUTE_IN_SECONDS + minute

    val arrivalHour = (departureTime + travelTime) / ONE_MINUTE_IN_SECONDS
    val arrivalMinute = (departureTime + travelTime) % ONE_MINUTE_IN_SECONDS

    print(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}