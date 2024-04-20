package lesson_10

fun main() {
    var winsHuman = 0
    while (true) {
        val moveHuman = randomNumber()
        val movePC = randomNumber()

        winsHuman = round(moveHuman, movePC, winsHuman)

        println("Хотите сыграть еще? (да/нет)")
        val wantMore = readln()
        if (wantMore != "да") {
            break
        }
    }

    println("Количество выйгранных раундов: $winsHuman")
}

fun randomNumber(): Int = (1..6).random()

fun round(numberHuman: Int, numberPC: Int, winsHuman: Int): Int {
    var roundWinsHuman = winsHuman
    println("Ход человека: $numberHuman")
    println("Ход машины: $numberPC")

    if (numberHuman > numberPC) {
        println("Победил человек")
        roundWinsHuman++
    } else if (numberHuman < numberPC) {
        println("Победила машина")
    } else {
        println("У вас ничья")
    }

    return roundWinsHuman
}