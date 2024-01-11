package lec_10

class KotlinPenguin(species: String) : KotlinAnimal(species, 2) {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 뒤뚱뒤뚱 걷습니다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}