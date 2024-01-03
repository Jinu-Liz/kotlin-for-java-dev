package lec_01

/**
 * 모든 변수는 우선 val로 만들고, 필요한 경우 var로 변경하면 깔끔한 코딩이 가능하다.
 */
fun main() {
    // 가변 변수
    var number1 = 10L
    number1 = 5L

    // 불변 변수
    val number2 = 10L
    number2 = 5L // 에러 발생

    // 타입을 명시적으로 작성해줄 수 있다.
    var number3: Long = 10L
    val nnmber4: Long = 5L

    var number: Int
    println(number) // 컴파일 에러 발생. 초기값을 지정해주어야 한다.

    /**
     * 코틀린은 reference type(Long)으로 타입을 선언해도, 연산 시에는 primitive type(long)으로 변경하여 적절히 처리해준다.
     * 연산 시, reference type을 사용할 경우, boxing/unboxing이 일어나 비효율적이기 때문.
     */
    var number5: Long = 20L

    // 자바에서는 reference type에 null이 들어갈 수 있지만, 코틀린에서는 그렇지 않다.
    var number6: Long = null

    // null이 들어갈 수 있다는 것을 알려주기 위해 '?'를 붙여야한다.
    var number7: Long? = null

    // 자바에서는 객체를 생성할 때, new를 붙이지만 코틀린은 new를 붙이지 않는다.
    var person = Person("지누리즈")
}