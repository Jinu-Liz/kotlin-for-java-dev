package lec_10

class KotlinPenguin(species: String) : KotlinAnimal(species, 2), KotlinSwimable, KotlinFlyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 뒤뚱뒤뚱 걷습니다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<KotlinSwimable>.act()
        super<KotlinFlyable>.act()
    }

    /**
     * 인터페이스에서 선언된 변수의 경우, getter를 만들어주지 않았다면
     * 상속받은 곳에서 override해주어야 한다.
      */
    override val swimAbility: Int
        get() = 3
}