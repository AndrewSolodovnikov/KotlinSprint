package lesson_13

fun main() {
    val contacts = listOf(
        PhoneInfo("Антон", 89001001010, null),
        PhoneInfo("Вася", 89081001010, null),
        PhoneInfo("Георгий", 89995551010, "null"),
        PhoneInfo("Антонина", 89079001010, "Google"),
        PhoneInfo("Виталий", 89067891010, "Apple")
    )

    contacts.filter { it.company != null && it.company != "null" }.forEach {
        println("Имя: ${it.name} \nТелефон: ${it.number} \nКомпания: ${it.company}")
    }
}

class PhoneInfo(val name: String, val number: Long, val company: String?)