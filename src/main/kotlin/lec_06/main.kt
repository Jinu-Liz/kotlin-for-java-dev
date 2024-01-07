package lec_06

fun main() {
    val numbers = listOf(1L, 2L, 3L)    // list 생성 메서드
    for (number in numbers) {
        println(number)
    }

    /**
     * 전통적인 for문
     * ..연산자의 경우, 범위를 생성하는 rangeTo함수를 호출한다.
     * rangeTo 함수의 경우, IntRange/LongRage 등의 Range 관련 객체를 반환한다.
     * 해당 Range 관련 객체는 IntProgression이라는 객체를 상속받고 있으며,
     * 해당 객체는 Iterable 객체를 반환한다.
     * downTo와 step의 경우, 중위 호출 함수이다.
     * '변수.함수이름(매개변수)'와 같은 형식 대신, '변수 함수이름 매개변수' 같은 형식으로 사용할 수 있게 해준다.
     */
    for (i in 1..3){
        println(i)
    }

    // 1씩 내려가는 경우, downTo 함수를 사용한다.
    for (i in 3 downTo 1) {
        println(i)
    }

    // 2씩 올라가는 경우
    for (i in 1..5 step 2) {
        println(i)
    }
}