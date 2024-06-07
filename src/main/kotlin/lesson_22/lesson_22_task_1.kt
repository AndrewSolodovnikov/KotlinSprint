package lesson_22

fun main() {
    val regularBook1 = RegularBook("Война и мир", "Лев Николаевич Толстой")
    val regularBook2 = RegularBook("Война и мир", "Лев Николаевич Толстой")

    val dataBook1 = DataBook("Война и мир", "Лев Николаевич Толстой")
    val dataBook2 = DataBook("Война и мир", "Лев Николаевич Толстой")

    /**
     * Обычные классы сравниваются по адресу объекта, поэтому когда разные адреса возвращается false.
     * При сравнении двух data class сравниваются данные в свойствах класса, если их содержание одинаково,
     * то воззвращается true
     */
    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)

    println(System.identityHashCode(regularBook1))
    println(System.identityHashCode(regularBook2))
    println(System.identityHashCode(dataBook1))
    println(System.identityHashCode(dataBook2))
}

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)