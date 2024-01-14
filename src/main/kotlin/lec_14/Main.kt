package lec_14

fun main() {
    val dto1 = KotlinPersonDto("지누리즈", 100)
    val dto2 = KotlinPersonDto("지누리즈", 200)
    println(dto1 == dto2)   // equals
    println(dto1)   // toString

    handleCar(Avante())
}

// sealed class 사용
private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Grandeur -> TODO()
    }
}