package lesson_13

fun main() {
    val contactsMethods = ContactMethod()

    do {
        println("Введите имя: ")
        val name = readln()
        println("Введите номер телефона:")
        val number = contactsMethods.enteredNumber()
        println("Введите компанию: ")
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

class ContactMethod {
    val contactsList = mutableListOf<ContactTemplate>()

    fun addContact(name: String, number: Unit, company: String?) {
        contactsList.add(ContactTemplate(name, number, company?.takeIf { it.isNotEmpty() }))
    }

    fun printContacts() {
        contactsList.mapNotNull { it.takeIf { it.company != null } }.forEach {
            println("Имя: ${it.name} \nТелефон: ${it.number} \nКомпания: ${it.company}")
        }
    }

    fun enteredNumber() {
        try {
            readln().toLong()
        } catch (e: NumberFormatException) {
            println(e.message)
            null
        }
    }
}

class ContactTemplate(val name: String, val number: Unit, val company: String? = null)