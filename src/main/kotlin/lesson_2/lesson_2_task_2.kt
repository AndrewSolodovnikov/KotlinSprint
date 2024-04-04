package lesson_2

fun main() {
    var numberOfEmployees = 50
    var numberOfInterns = 20
    var salaryOfEmployees = 30_000
    var salaryOfInterns = 20_000

    var oplataE = numberOfEmployees * salaryOfEmployees
    var oplataObsh = numberOfInterns * salaryOfInterns + oplataE
    var sredOplata = oplataObsh / (numberOfEmployees + numberOfInterns)

    println(oplataE)
    println(oplataObsh)
    println(sredOplata)
}
