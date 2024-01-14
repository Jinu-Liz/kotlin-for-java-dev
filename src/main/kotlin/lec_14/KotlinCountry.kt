package lec_14

fun handleCountry(country: KotlinCountry) {

    /**
     * kotlin에서 enum과 when을 사용하여 가독성을 높일 수 있고,
     * 컴파일러가 enum 클래스의 모든 타입을 알고 있어, 다른 타입에 대한 로직을 작성하지 않아도 된다.
     * (java에서 switch랑 똑같은듯)
     * 추가로, enum에 변화가 생길 경우, when에 추가 처리를 하라는 알림이 뜨므로 바로 알 수 있다.
     */
    when (country) {
        KotlinCountry.KOREA -> TODO()
        KotlinCountry.AMERICA -> TODO()
    }
}

enum class KotlinCountry(private val code: String) {
    KOREA("KO"),
    AMERICA("US")
    ;
}