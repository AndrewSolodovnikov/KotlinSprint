package lesson_10

fun main() {
    var winsHuman = 0
    while (true) {
        val moveHuman = randomNumber()
        val movePC = randomNumber()

        winsHuman += round(moveHuman, movePC)

        println("Хотите сыграть еще? (да/нет)")
        val wantMore = readln()
        if (wantMore != "да") {
            break
        }
    }

    println("Количество выйгранных раундов: $winsHuman")
}

fun randomNumber(): Int = (1..6).random()

fun round(numberHuman: Int, numberPC: Int): Int {
    println("Ход человека: $numberHuman")
    println("Ход машины: $numberPC")

    if (numberHuman > numberPC) {
        println("Победил человек")
        return 1
    } else if (numberHuman < numberPC) {
        println("Победила машина")
        return 0
    } else {
        println("У вас ничья")
        return 0
    }
}