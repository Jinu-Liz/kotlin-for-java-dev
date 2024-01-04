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

    printAgeIfPersonNullable(null)


    // String interpolation
    val person = Person("지누리즈", 100)
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."

    val name = "지누리즈"
    println("이름 : $name")   // 그냥 변수를 사용할 경우, 중괄호 생략 가능 (그러나 사용하는 것이 가독성을 위해서는 좋다.)


    // javascript의 백틱(`)같이 사용할 수 있음
    val str = """
    ABC
    EFG
    ${name}
    HIJ
    """.trimIndent()
    println(str)


    // String Indexing
    val str1 = "ABCDE"
    println(str1[0])    // A
    println(str1[2])    // C
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person3) {   // java에서는 instance of를 사용하지만, kotlin에서는 is를 사용한다.
        val person = obj as Person3     // 캐스팅 시 as를 사용 ( (Person3) obj )
        println(person.age)
    }

    if (obj is Person3) {
        println(obj.name)   // 조건문에 해당 타입을 체크하는 로직이 있는 경우, 내부에서 자동완성을 사용할 수 있다. (스마트 캐스트)
    }

    if (obj !is Person3) {  // 반대의 경우, is 앞에 '!'를 붙인다.
        println(obj.name)
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person3    // null이 들어올 경우, NPE가 발생하므로 as 뒤에 '?'를 붙여 nullable하다는 것을 알려줘야한다.
    println(person?.age)
}