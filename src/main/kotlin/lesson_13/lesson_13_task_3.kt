package lesson_13

fun main() {
    val contacts = listOf(
        PhoneInfo("Антон", 89001001010, null),
        PhoneInfo("Вася", 89081001010, null),
        PhoneInfo("Георгий", 89995551010, "null"),
        PhoneInfo("Антонина", 89079001010, "Google"),
        PhoneInfo("Виталий", 89067891010, "Apple"))

    contacts.forEach {
        println("Имя: ${it.name} \nТелефон: ${it.number} \nКомпания: ${it.company}")
    }
}

class PhoneInfo(name: String, number: Long, company: String?) {
    val name: String = name
    val number: Long = number
    val company: String? = company
}