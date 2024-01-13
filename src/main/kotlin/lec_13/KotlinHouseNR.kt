package lec_13

class KotlinHouseNR(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    // 권장되지 않는 클래스 안의 클래스
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@KotlinHouseNR.address  // 바깥 참조를 위해 this@바깥클래스 사용
    }
}