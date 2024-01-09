package lec_09

/**
 * kotlin에서는 필드만 만들면 getter/setter를 자동으로 만들어준다.
 * 주 생성자는 반드시 필요하다.
 */
class KotlinPerson(val name: String, var age: Int) {
    // 초기화 시점에 1번 호출되는 블록
    init {
        if (age <= 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        println("초기화 블록")
    }

    /**
     * 파라미터가 다른 생성자를 추가하고 싶은 경우, constructor를 통해 생성. (부 생성자)
     * 부 생성자는 body를 가질 수 있다.
     * 하지만, kotlin에서는 부 생성자보다는 default parameter를 권장한다.
     */
    constructor(name: String): this(name, 1) {
        println("부 생성자1")
    }

    constructor(): this("지누리즈") {
        println("부 생성자2")
    }
}