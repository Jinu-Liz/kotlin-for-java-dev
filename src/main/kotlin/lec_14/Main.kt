package lec_14

fun main() {
    val dto1 = KotlinPersonDto("지누리즈", 100)
    val dto2 = KotlinPersonDto("지누리즈", 200)
    println(dto1 == dto2)   // equals
    println(dto1)   // toString
}