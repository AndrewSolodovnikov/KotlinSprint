package lesson_19

const val FEMALE_CHAR = "ж"
const val MALE_CHAR = "м"
fun main() {
    val clientList = mutableListOf<Client>()

    repeat(5) {
        println("Введите имя:")
        val name = readln()
        var gender: String?

        do {
            println("Введите пол буквой Ж или М")
            gender = readln().lowercase()
            if (gender == FEMALE_CHAR) {
                gender = Gender.FEMALE.description
            } else if (gender == MALE_CHAR) {
                gender = Gender.MALE.description
            } else {
                println("Что-то пошло не так!")
                gender = null
            }
        } while (gender == null)

        clientList.add(Client(name, gender))
    }

    clientList.forEach { println(it.toString()) }
}

class Client(var name: String, private val gender: String) {
    override fun toString(): String {
        return "Имя: $name, Пол: $gender"
    }
}

enum class Gender(val description: String) {
    FEMALE("Женский"),
    MALE("Мужской"),
}