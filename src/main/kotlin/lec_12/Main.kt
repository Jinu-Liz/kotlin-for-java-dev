package lec_12

fun main() {

    println(Singleton.a)
    Singleton.a += 10

    println(Singleton.a)
}


// kotlin에서 singleton을 사용하는 방법.
object Singleton {
    var a: Int = 0
}