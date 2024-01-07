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

/**
 * kotlin에서의 switch문 사용.
 * when 또한 Expression이므로 return한다.
 */
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

// 다양한 조건을 가지고 분기가 가능하다.
fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

// 타입 검사도 가능
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 여러 조건을 간단하게 표현 가능
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디에서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

// 값 없이 early return처럼 활용할 수 있다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}