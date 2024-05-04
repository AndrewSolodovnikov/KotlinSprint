package lesson_14

import kotlin.math.PI

fun main() {
    val white = "white"
    val black = "black"

    val listFigure = listOf(
        Circle(white, 2.7),
        Circle(white, 5.5),
        Circle(white, 9.2),
        Circle(black, 4.4),
        Circle(black, 12.2),

        Rectangle(white, 3.3, 2.1),
        Rectangle(white, 4.2, 3.2),
        Rectangle(black, 7.3, 5.1),
        Rectangle(black, 8.3, 4.7),
        Rectangle(black, 5.8, 4.6)
    )

    // вариант 1
    var sumPerimetersBlackFigureForEach : Double = 0.0
    var sumPerimetersWhiteFigureForEach : Double = 0.0
    var sumAreaBlackFigureForEach : Double = 0.0
    var sumAreaWhiteFigureForEach : Double = 0.0

    listFigure.forEach {
        if (it.color == white) {
            sumAreaWhiteFigureForEach += it.calculateArea()
            sumPerimetersWhiteFigureForEach += it.calculatePerimeter()
        } else {
            sumAreaBlackFigureForEach += it.calculateArea()
            sumPerimetersBlackFigureForEach += it.calculatePerimeter()
        }
    }

    println("Вариант 1")
    println(sumPerimetersBlackFigureForEach)
    println(sumPerimetersWhiteFigureForEach)
    println(sumAreaBlackFigureForEach)
    println(sumAreaWhiteFigureForEach)

    // вариант 2
    val listBlackFigure = listFigure.filter { it.color == "black" }
    val listWhiteFigure = listFigure.filter { it.color == "white" }

    val sumPerimetersBlackFigure = listBlackFigure.sumOf { it.calculatePerimeter() }
    val sumPerimetersWhiteFigure = listWhiteFigure.sumOf { it.calculatePerimeter() }

    val sumAreaBlackFigure = listBlackFigure.sumOf { it.calculateArea() }
    val sumAreaWhiteFigure = listWhiteFigure.sumOf { it.calculateArea() }

    println()
    println("Вариант 2")
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