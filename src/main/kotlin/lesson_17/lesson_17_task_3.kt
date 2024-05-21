package lesson_17

fun main() {
    val folder1 = Folder("Doc", 4, true)
    val folder2 = Folder("Music", 7, false)

    println("Имя папки: ${folder1.folderName}")
    println("Количество файлов: ${folder1.numOfFiles}")
    println()
    println("Имя папки: ${folder2.folderName}")
    println("Количество файлов: ${folder2.numOfFiles}")
}

class Folder(val name: String, val numberOfFiles: Int, val isSecret: Boolean) {
    val folderName: String
        get() = if (isSecret) "Скрытая папка" else name

    val numOfFiles: Int
        get() = if (isSecret) 0 else numberOfFiles
}