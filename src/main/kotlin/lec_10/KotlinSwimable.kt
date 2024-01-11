package lec_10

interface KotlinSwimable {

    // backing field 없는 프로퍼티를 인터페이스에 만들 수 있다.
    val swimAbility: Int
        get() = 2

    fun act() {
        println("첨벙첨벙")
    }
}