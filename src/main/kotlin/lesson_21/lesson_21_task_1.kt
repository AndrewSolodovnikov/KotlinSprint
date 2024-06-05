package lesson_21

fun main() {
    fun String.vowelCount(): Int {
        val vowelList = listOf<Char>('a', 'e', 'i', 'u', 'y', 'o')
        return this.count {char -> char.lowercaseChar() in vowelList}
    }

    val inputPhrase = readln()
    val count = inputPhrase.vowelCount()
    println(count)
}