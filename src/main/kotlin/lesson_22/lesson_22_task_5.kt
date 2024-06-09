package lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавр",
        "тройная звёздная система в созвездии Центавра",
        "07-06-2024",
        4.36)

    println("${alphaCentauri.component1()} - ${alphaCentauri.component2()} \n" +
            "Дата фиксации события: ${alphaCentauri.component3()} \n" +
            "Расстояние от Земли: ${alphaCentauri.component4()} св. лет")
}

data class GalacticGuide(
    val namePlaceOrEven: String,
    val descriptionPlaceOrEven: String,
    val dateOrTime: String,
    val distanceFromEarth: Double,
)