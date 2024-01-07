package lec_05

// 조건문에서 예외 처리 시 new를 생략하는 것 이외에는 java와 다르지 않다.
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
}

// 범위를 나타낼 때, (score >= 0 && score <= 100)같은 범위를 in을 사용하여 간단하게 표현 가능하다.
fun validateScoreIsNotNegative2(score: Int) {
    if (score !in 0..100) throw IllegalArgumentException("${score}의 범위는 0부터 100입니다.")
}

/**
 * java에서 if-else는 statement이지만, kotlin에서는 expression이다.
 * Statement : 프로그램의 문장. 하나의 값으로 도출되지 않는다.
 * Expression : 하나의 값으로 도출되는 문장.
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {   // 하나의 값으로 도출되므로 if 앞에 return 사용이 가능함.
        return "P"
    } else {
        return "F"
    }
}
// java에서는 삼항연산자를 사용하지만, kotlin에는 바로 return이 가능하기 때문에 삼항연산자가 없음.
fun getPassOrFail2(score: Int): String {
    return (score >= 50) ? "P" : "F"
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}