package lesson_21

fun main() {
    fun String.vowelCount(): Int {
        val vowelList = listOf<Char>('a', 'e', 'i', 'u', 'y', 'o')
        var count = 0
        for (char in this) {
            if (vowelList.contains(char.lowercaseChar())) {
                count++
            }
        }
        return count
    }

    val inputPhrase = readln()
    val count = inputPhrase.vowelCount()
    println(count)
}