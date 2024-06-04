package lesson_20

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { string ->
        reversedString(string)
    }
    robot.say()
}

class Robot {
    val phrasesList = listOf<String>(
        "Привет дружище",
        "Как дела",
        "Сколько лет",
        "Будь здоров",
        "Давай пока"
    )

    var modifierString: ((String) -> String)? = null

    fun say() {
        val phrase = phrasesList[(phrasesList.indices).random()]
        val sayPhrase = modifierString?.invoke(phrase) ?: phrase
        println(sayPhrase)
    }

    fun setModifier(mod: (String) -> String) {
        modifierString = mod
    }

}

fun reversedString(string: String): String {
    return string.split(" ").reversed().joinToString(" ")
}