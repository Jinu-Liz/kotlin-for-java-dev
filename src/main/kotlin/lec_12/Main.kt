package lec_12

fun main() {

    println(Singleton.a)
    Singleton.a += 10

    println(Singleton.a)


    // 익명 클래스 사용 법
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}


// kotlin에서 singleton을 사용하는 방법.
object Singleton {
    var a: Int = 0
}


private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}