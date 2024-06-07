package lesson_22

fun main() {
    val literature = Literature("Война и мир", "Лев Николаевич Толстой")
    val dataLiterature = DataLiterature("Война и мир", "Лев Николаевич Толстой")

    /**
     * У обычных классов не переопределен метод toString() и поэтому в консоль печатается адрес объекта в памяти.
     * У data class метод toString() переопределен и в консоль выводится запись в формате свойство = значение.
     * Кроме toString(), в data class переопределены:
     * hashCode() - возвращает уникальный код объекта
     * equals() - нужен для сравнения двух объектов
     * copy() - для копирования объекта. У объекта копируются все свойства и ему присваивается новый адрес в памяти.
     */
    println(literature)
    println(dataLiterature)
}

class Literature(val title: String, val author: String)

data class DataLiterature(val title: String, val author: String)