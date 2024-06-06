package lesson_21

import java.io.File

fun main() {
    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()

    wordsFile.writeTextLowerCase("Первая строка по коду ПЕРЕВОДЯЩАЯ СИМВОЛЫ В НИЖНИЙ РЕГИСТР")
    wordsFile.writeTextToBeginning("Вторая строка по коду, которая станет первой в файле")
}

fun File.writeTextLowerCase(string: String) {
    return writeText(string.lowercase())
}

fun File.writeTextToBeginning(string: String) {
    val readFile = this.readLines()
    this.writeText("$string\n${readFile.joinToString("\n")}")
}

