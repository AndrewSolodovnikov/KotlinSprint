package lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 20
    val salaryOfEmployees = 30_000
    val salaryOfInterns = 20_000

    val employeePayment = numberOfEmployees * salaryOfEmployees
    val allPayment = numberOfInterns * salaryOfInterns + employeePayment
    val averagePayment = allPayment / (numberOfEmployees + numberOfInterns)

    println(employeePayment)
    println(allPayment)
    println(averagePayment)
}
