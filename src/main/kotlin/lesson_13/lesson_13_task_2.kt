package lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory("Антон", 89001001010, null)
}

class PhoneDirectory(name: String, number: Long, company: String?) {
    init {
        println(
            "Имя: $name \nТелефон: $number \n" +
                    "${if (company != null) "Компания: $company" else "<не указано>"}"
        )
    }
}