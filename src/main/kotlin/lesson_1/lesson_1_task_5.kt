package lesson_1

const val allSeconds = 6488
const val oneHourInSeconds = 3600
const val oneMinuteInSeconds = 60
fun main() {
    val hours = allSeconds / oneHourInSeconds
    val remainingSeconds = allSeconds - (hours * oneHourInSeconds)
    val minutes = remainingSeconds / oneMinuteInSeconds
    val seconds = remainingSeconds % oneMinuteInSeconds

    val timerStr = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    print(timerStr)
}