package lec_14

/**
 * data를 붙이게 되면,
 * equals, hashCode, toString 메서드를 자동으로 만들어 준다.
 * java에서는 JDK16부터 비슷한 record가 생김
 */
data class KotlinPersonDto(
    val name: String,
    val age: Int,
) {
}