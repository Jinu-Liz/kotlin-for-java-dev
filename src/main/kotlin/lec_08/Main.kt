package lec_08

fun main() {

}

fun maxV1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxV2(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxV3(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// '=' 을 사용하는 경우 반환 타입이 생략 가능
fun maxV4(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

// 중괄호 생략 가능
fun maxV5(a: Int, b: Int) = if (a > b) a else b