package lesson_1

fun main() {
    val allSeconds = 6488

    val hours = allSeconds / 3600
    val minutes = (allSeconds - (hours * 3600)) / 60
    val seconds = (allSeconds - (hours * 3600)) % 60

    val hoursFromTimer = String.format("%02d", hours)
    val minutesFromTimer = String.format("%02d", minutes)
    val secondsFromTimer = String.format("%02d", seconds)

    print(hoursFromTimer)
    print(":")
    print(minutesFromTimer)
    print(":")
    print(secondsFromTimer)

}