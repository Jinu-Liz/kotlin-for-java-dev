package lec_04

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    // kotlin에서는 비교연산자 사용 시, 자동으로 compareTo를 호출해준다.
    if (money1 > money2) println("Money1의 금액이 더 큽니다.")

    /**
     * java에서는 동일성에 '=='을 사용, 동등성에 equals를 호출하여 비교했다면,
     * kotlin에서는 동일성에 '==='을 사용, 동등성에 '=='을 호출하여 비교한다.
     * '=='을 사용하면 간접적으로 equals를 호출한다.
     */
    val money3 = JavaMoney(1000L)
    val money4 = money3
    val money5 = JavaMoney(1000L)

    println(money3 == money5)       // true
    println(money3 === money5)      // false

    // Lazy 연산을 통해 true이면 뒤를 실행하지 않는다.
    if (fun1() || fun2()) println("본문")     // fun2는 실행하지 않음
    if (fun2() && fun1()) println("본문")     // fun1는 실행하지 않음
}

fun fun1(): Boolean {
    println("fun 1")

    return true
}

fun fun2(): Boolean {
    println("fun 2")

    return false
}