package lesson_19

fun main() {
    val clientList = mutableListOf<Client>()

    repeat(5) {
        println("Введите имя:")
        val name = readln()

        while (true) {
            println("Введите пол буквой Ж или М")
            var gender = readln()
            if (gender.lowercase() == "ж") {
                gender = Gender.FEMALE.description
            } else if (gender.lowercase() == "м") {
                gender = Gender.MALE.description
            } else {
                println("Что-то пошло не так!")
                continue
            }
            clientList.add(Client(name, gender))
            break
        }
    }

    clientList.forEach{ println(it.toString()) }
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