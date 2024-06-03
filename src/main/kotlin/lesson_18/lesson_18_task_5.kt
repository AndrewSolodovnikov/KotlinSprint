package lesson_18

fun main() {
    val screen = Screen()
    val circle = Circle(7.3, 4, 3)
    val square = Square(5, 6, 4)
    val point = Point(5.5, 6.6)

    circle.draw()
    square.draw()
    point.draw()
}

class Circle(private val x: Number, private val y: Number, val radius: Number) {
    fun draw() {
        println(
            "Нарисован круг радиусом $radius с координатами: \n" +
                    "x: $x \n" +
                    "y: $y"
        )
    }
}

class Square(private val x: Number, private val y: Number, val sideSquare: Number) {
    fun draw() {
        println(
            "Нарисован квадрат со сторонами $sideSquare и координатами: \n" +
                    "x: $x \n" +
                    "y: $y"
        )
    }
}

class Point(private val x: Number, private val y: Number) {
    fun draw() {
        println(
            "Нарисована точка с координатами: \n" +
                    "x: $x \n" +
                    "y: $y"
        )
    }
}

class Screen {
    fun draw(x: Int, y: Int, figure: Any) {
        when (figure) {
            is Circle -> draw(Circle(x, y, figure.radius))
            is Square -> draw(Square(x, y, figure.sideSquare))
            is Point -> draw(Point(x, y))
        }
    }

    fun draw(x: Double, y: Double, figure: Any) {
        when (figure) {
            is Circle -> draw(Circle(x, y, figure.radius))
            is Square -> draw(Square(x, y, figure.sideSquare))
            is Point -> draw(Point(x, y))
        }
    }

    private fun draw(circle: Circle) {
        circle.draw()
    }

    private fun draw(square: Square) {
        square.draw()
    }

    private fun draw(point: Point) {
        point.draw()
    }
}