package lesson_14

import kotlin.math.PI

fun main() {
    val listFigure = listOf(
        Circle("white", 2.7),
        Circle("white", 5.5),
        Circle("white", 9.2),
        Circle("black", 4.4),
        Circle("black", 12.2),

        Rectangle("white", 3.3, 2.1),
        Rectangle("white", 4.2, 3.2),
        Rectangle("black", 7.3, 5.1),
        Rectangle("black", 8.3, 4.7),
        Rectangle("black", 5.8, 4.6)
    )

    val sumPerimetersBlackFigure = listFigure.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    val sumPerimetersWhiteFigure = listFigure.filter { it.color == "white" }.sumOf { it.calculatePerimeter() }

    val sumAreaBlackFigure = listFigure.filter { it.color == "black" }.sumOf { it.calculateArea() }
    val sumAreaWhiteFigure = listFigure.filter { it.color == "white" }.sumOf { it.calculateArea() }

    println(sumPerimetersBlackFigure)
    println(sumPerimetersWhiteFigure)
    println(sumAreaBlackFigure)
    println(sumAreaWhiteFigure)
}

abstract class Figure(val color: String) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

    override fun calculateArea(): Double {
        return PI * radius * radius
    }

}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculatePerimeter(): Double {
        return (width + height) * 2
    }

    override fun calculateArea(): Double {
        return width * height
    }

}