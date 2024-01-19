package lec_20

fun main() {

}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }

    /**
     * 위의 코드와 동일함.
     * let : 함수를 받아 해당 함수를 실행시키는 함수.
     * let은 scope function이다.
     * scope function은 람다를 사용해 일시적인 영역을 만들어
     * 코드를 더 간결하게 만들거나, method chaining에 활용하는 함수를 뜻한다.
     *
     * let을 통해 람다를 넣음으로써
     * 일시적인 영역이 생김
     */
    person?.let {
        println(person.name)
        println(person.age)
    }
}

fun scopeFunction(person: Person) {

    /**
     * let
     * 마지막에있는 expression이 return 값이 됨. (람다의 결과)
     * age가 반환
     * it 사용
     * 일반 함수를 받는다.
     */
    val value1 = person.let { it.age }

    /**
     * run
     * 마지막에있는 expression이 return 값이 됨. (람다의 결과)
     * age가 반환
     * this 사용
     * 확장 함수를 받는다.
     */
    val value2 = person.run { this.age }

    /**
     * also
     * 객체 그 자체
     * person 반환
     * it 사용
     */
    val value3 = person.also { it.age }

    /**
     * apply
     * 객체 그 자체
     * person 반환
     * this 사용
     */
    val value4 = person.apply { this.age }

    val person = Person("지누리즈", 200)
    with(person) {
        println(name)
        println(this.age)
    }


    /**
     * let의 사용처
     */

    // 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)

    // non-null값에 대해서만 code block을 실행시킬 때
    val str = "APPLE"
    val length = str?.let {
        print(it.uppercase())
        it.length
    }

    // 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)


}