package lec_09

fun main() {
    // kotlin getter/setter
    val person = KotlinPerson("지누리즈", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    /**
     * java class를 사용할 경우, kotlin과 표현이 동일하지만
     * getter/setter를 호출한다.
     */
    val javaPerson = JavaPerson("지누리즈", 100)
    println(javaPerson.name)
    println(javaPerson.age)
}