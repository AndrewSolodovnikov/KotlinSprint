package lesson_17

fun main() {
    val parcel = Parcel("757689", "Париж")
    println("Старое местонахождение: ${parcel.parcelLocation}")
    println("Количество транзитов: ${parcel.getNumberOfMovements()}")
    parcel.parcelLocation = "Лондон"
    println("Новое местонахождение: ${parcel.parcelLocation}")
    println("Количество транзитов: ${parcel.getNumberOfMovements()}")
}

class Parcel(val parcelNumber: String, private var placeOfStorage: String) {
    private var numberOfMovements = 0

    var parcelLocation: String = placeOfStorage
        set(value) {
            field = value
            numberOfMovements++
        }

    fun getNumberOfMovements(): Int {
        return numberOfMovements
    }
}