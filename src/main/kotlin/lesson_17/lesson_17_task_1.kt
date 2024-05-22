package lesson_17

fun main() {

}

class QuizGame(private val answer: String, private var question: String) {
    val myAnswer: String = answer
        get() = field

    var maQuestion: String = question
        get() = field
        set(value: String) {
            field = value
        }
}