package lesson_13

fun main() {
    val contactsMethods = ContactsMethods()

    do {
        println("Введите имя:")
        val name = readln()
        println("Введите номер телефона:")
        val number = readln().toLongOrNull()
        println("Введите компанию:")
        val company = readln()

        if (number != null) {
            contactsMethods.addContact(name, number, company)
        } else {
            println("Не введен номер телефона")
        }

        println("Ввести еще один контакт? (да/нет)")
        val continueRecording = readln().lowercase()
    } while (continueRecording == "да")

    contactsMethods.printContacts()
}

class ContactsMethods {
    val contactsList = mutableListOf<Contact>()

    fun addContact(name: String, number: Long, company: String?) {
        contactsList.add(Contact(name, number, company))
    }

    fun printContacts() {
        contactsList.filter { it.company != null && it.company != "null" }.forEach {
            println("Имя: ${it.name} \nТелефон: ${it.number} \nКомпания: ${it.company}")
        }
    }
}

class Contact(val name: String, val number: Long, val company: String?)