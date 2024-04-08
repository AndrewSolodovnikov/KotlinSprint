package lesson_3

fun main() {
    val chessMove = "D2-D4;0"
    val elements = chessMove.split('-', ';')

    val whiteInitialMove = elements[0]
    val whiteFinalMove = elements[1]
    val moveNumber = elements[2]

    println(whiteInitialMove)
    println(whiteFinalMove)
    println(moveNumber)
}
