package lec_03

fun main() {
    /**
     * number1의 경우, 타입이 int이기 때문에 에러가 발생한다.
     * java에서는 long타입이 더 크기 때문에 문제가 되지 않지만, kotlin에서는 이를 구분하고 있다.
     * 따라서 변환용 메서드를 사용해야 한다.
     */
    val number1 = 3
    val number2: Long = number1     // 에러
    val number3: Long = number1.toLong()

    val number4 = 3
    val number5 = 5
    val floatResult = number4 / number5.toDouble()

    /**
     * nullable한 경우에는 변환 시 null이 들어갈 수 있으므로 에러가 발생한다.
     * 따라서 이런 경우에는 별도의 처리를 해주어야 한다.
     */
    val number6: Int? = 3
    val number7: Long = number6.toLong()    // 에러
    val number8: Long = number6?.toLong() ?: 0L     // safe call / elvis를 통해 처리
}