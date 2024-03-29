package lec_16

fun main() {
    val str = "ABC"
    str.lastChar()  // 확장 함수 사용

    val person = Person("A", "B", 100)
    person.nextYearAge()

    /**
     * 해당 변수의 현재 타입(정적 타입)에 의해 어떤 확장함수가 호출될 지 결정된다.
     */
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive()  // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive()  // Srt의 확장함수


    3.add(4)
    3.add2(4)
    3 add2 4    // 중위함수 사용
}


/**
 * 확장함수
 * JS의 Prototype 같은 느낌. 기존 클래스에 추가 메서드를 만들어 사용한다.
 * 확장함수에서는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.
 * public을 이용하여 private / protected를 꺼내는 것은 캡슐화를 깨기 때문.
 */
// String의 확장함수.
fun String.lastChar(): Char {
    return this[this.length - 1]    // this(수신객체)를 이용하여 실제 클래스 안의 값에 접근.
}

// 확장 프로퍼티 (확장함수 + custom getter)
val String.lastChar: Char
    get() = this[this.length - 1]

/**
 * 확장함수와 멤버함수의 시그니처가 겹치면, 멤버함수가 우선적으로 호출된다.
 * 따라서, 확장함수를 만들었지만 다른 기능의 똑같은 멤버함수가 생기면 오류가 발생할 수 있다.
 */
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 2
}


/**
 * 중위함수
 */

// 확장함수
fun Int.add(other: Int): Int {
    return this + other
}

// 확장함수 + 중위함수
infix fun Int.add2(other: Int): Int {
    return this + other
}


/**
 * inline 함수
 * 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복사한다.
 * 함수를 파라미터로 전달할 때, 함수가 함수를 부르고 그 함수가 또 다른 함수를 부르는 형태가 계속되면
 * call chain에 오버헤드(overhead)가 생기게 된다.
 * 이를 줄이기 위해 사용한다.
 * 그러나 inline 함수는 성능측정과 함께 적절하게 사용되어야한다.
 */
inline fun Int.add3(other: Int): Int {
    return this + other
}


/**
 * 지역함수
 * 함수로 추출하면 좋을 것 같은데, 이 함수를 현재 함수 내에서만 사용하고 싶을 때 사용한다.
 * 그러나, depth가 깊어지기도 하고 코드가 깔끔해지지 않는다.
 */

// 해당 내 코드가 중복된다.
fun createPerson(firstName: String, lastName: String): Person {
    if (firstName.isEmpty()) throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값 : $firstName")

    if (lastName.isEmpty()) throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값 : $lastName")

    return Person(firstName, lastName, 1)
}

fun createPersonRefactoring(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}