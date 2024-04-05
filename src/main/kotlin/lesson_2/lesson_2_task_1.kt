package lesson_2

fun main() {
    var grade1 = 3
    var grade2 = 4
    var grade3 = 3
    var grade4 = 5
    var numberOfStudents = 4

    var averageGrade = ((grade1 + grade2 + grade3 + grade4).toFloat() / numberOfStudents)

    println("%.2f".format(averageGrade))
}