package lesson_20

fun main() {
    val printString: (String) -> Unit = { username: String -> println("С наступающим Новым Годом, $username!") }

    val username = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Аноним"
    printString(username)
}