package lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавр",
        "тройная звёздная система в созвездии Центавра",
        "07-06-2024",
        4.36)

    val (namePlaceOrEven, descriptionPlaceOrEven, dateOrTime, distanceFromEarth) = alphaCentauri

    println("$namePlaceOrEven - $descriptionPlaceOrEven \n" +
            "Дата фиксации события: $dateOrTime \n" +
            "Расстояние от Земли: $distanceFromEarth св. лет")
}

data class GalacticGuide(
    val namePlaceOrEven: String,
    val descriptionPlaceOrEven: String,
    val dateOrTime: String,
    val distanceFromEarth: Double,
)