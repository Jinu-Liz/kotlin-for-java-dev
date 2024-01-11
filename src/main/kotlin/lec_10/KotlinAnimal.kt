package lec_10

/**
 * kotlin의 경우, 추상 프로퍼티가 아니라면, 상속받을 때 open을 꼭 붙여야 한다.
 */
abstract class KotlinAnimal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}