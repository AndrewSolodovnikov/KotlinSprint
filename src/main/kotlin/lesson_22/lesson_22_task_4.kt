package lesson_22

fun main() {
    val viewModel = ViewModel()
    viewModel.loadData()
}

data class MainScreenState(var data: String? = null, var isLoading: Boolean = false)

class ViewModel {
    private var mainScreenState = MainScreenState()
    fun loadData() {
        if (mainScreenState.data == null) println("Данные отсутствуют")
        println(mainScreenState)
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy("Новые данные", true)
        if (mainScreenState.isLoading) println("Началась загрузка")
        Thread.sleep(1000)
        println(mainScreenState)
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = false)
        if (!mainScreenState.isLoading) println("Загрузка данных завершена")
    }
}