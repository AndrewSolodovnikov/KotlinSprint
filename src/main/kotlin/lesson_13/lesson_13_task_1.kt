package lesson_13

fun main() {
    val phoneDirectory = PhonesDirectory("Антон", 89001001010, null)

}

class PhonesDirectory(name: String, number: Long, company: String?) {
    init {
        println("Имя: $name")
        println("Телефон: $number")
        if (company != null) println("Компания: $company")
    }
}