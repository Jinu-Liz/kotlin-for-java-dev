package lec_13

class KotlinHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    /**
     * 중첩 클래스를 만들 때 그냥 클래스 만드는 것처럼 만들면 된다.
     * 기본적으로 kotlin에서는 바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어진다.
     */
    class LivingRoom(
        private var area: Double
    )
}