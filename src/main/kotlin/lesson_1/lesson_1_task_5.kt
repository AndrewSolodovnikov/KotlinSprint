package lesson_1

const val ONE_HOUR_IN_SECONDS = 3600
const val ONE_MINUTE_IN_SECOND = 60
fun main() {
    var allSeconds = 6488

    val hours = allSeconds / ONE_HOUR_IN_SECONDS
    val remainingSeconds = allSeconds - (hours * ONE_HOUR_IN_SECONDS)
    val minutes = remainingSeconds / ONE_MINUTE_IN_SECOND
    val seconds = remainingSeconds % ONE_MINUTE_IN_SECOND

    print(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}