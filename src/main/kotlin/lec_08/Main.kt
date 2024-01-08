package lec_08

fun main() {
    // 파라미터가 있는 경우, 해당 파라미터값을 사용한다.
    repeat("Hello World", 3, false)

    /**
     * 중간 파라미터는 기본값을 사용하고, 그 다음부터 셋팅하고 싶은 경우
     * 해당 파라미터를 명시적으로 표시하여 값을 넘긴다.
     * 이를 'named argument'라고 한다.
     */
    repeat("Hello World", useNewLine = false)
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


// 기본값을 셋팅하여, 해당 파라미터가 없는 경우 기본값을 사용할 수 있다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}