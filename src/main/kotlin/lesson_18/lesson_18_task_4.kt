package lesson_18

fun main() {
    val rectangularBox = RectangularBox(2,3,5)
    val squareBox = SquareBox(4)

    println("Площадь прямоугольной коробки равна: ${rectangularBox.areaBox()}")
    println("Площадь квадратной коробки равна: ${squareBox.areaBox()}")
}

abstract class Box {
    abstract fun areaBox(): Int
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int,
): Box() {
    override fun areaBox(): Int {
        return 2 * length * width + 2 * length * height + 2 * width * height
    }
}

class SquareBox(
    private val edge: Int
): Box() {
    override fun areaBox(): Int {
        return 6 * edge * edge
    }
}