package lesson_13

fun main() {
    val phoneDirectory = PhoneNunDirectory("Антон", 89001001010)
}

class PhoneNunDirectory(name: String, number: Long, company: String? = null) {
    init {
        println(
            "Имя: $name \nТелефон: $number \n" +
                    "${if (company != null) "Компания: $company" else "<не указано>"}"
        )
    }
}