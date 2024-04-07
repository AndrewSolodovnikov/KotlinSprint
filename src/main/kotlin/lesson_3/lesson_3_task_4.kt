package lesson_3

fun main() {
    var whiteInitialMove = "E2"
    var whiteFinalMove = "E4"
    var moveNumber = 1

    println(String.format("$whiteInitialMove-$whiteFinalMove; $moveNumber"))

    whiteInitialMove = "D2"
    whiteFinalMove = "D4"
    moveNumber++

    println(String.format("$whiteInitialMove-$whiteFinalMove; $moveNumber"))
}