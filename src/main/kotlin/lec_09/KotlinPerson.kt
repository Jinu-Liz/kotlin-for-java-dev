package lec_09

/**
 * kotlin에서는 필드만 만들면 getter/setter를 자동으로 만들어준다.
 * 주 생성자는 반드시 필요하다.
 */
class KotlinPerson(name: String, var age: Int) {
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


    // class내에서 함수처럼 만들 수도 있으나
    fun isAdult(): Boolean {
        return  this.age >= 20
    }

    /**
     * custom getter를 사용하여 프로퍼티처럼 만들 수도 있다.
     * 해당 성격이 객체의 속성을 나타내는 것이라면, custom getter를 쓰는 것이 좋고
     * 그렇지 않다면, 함수를 쓰는 것이 좋다.
      */
    val isAdult: Boolean
        get() = this.age >= 20

    // 위와 동일.
    val isAdult2: Boolean
        get() {
            return this.age >= 20
        }

    /**
     * custom getter를 사용하여, getter를 사용할 경우에 별도의 처리를 할 수 있는데
     * 이 경우에는 필드명 대신 field를 사용한다.
     * 해당 프로퍼티를 사용할 경우, get을 통해 자기 자신을 호출하고 다시 get을 호출하여
     * 무한 루프 현상이 발생하기 때문.
     */
    val name: String = name
        get() = field.uppercase()
}