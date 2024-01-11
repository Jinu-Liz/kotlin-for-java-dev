package lec_10

/**
 * 상속을 사용할 경우에는 타입을 정해줄 때랑 똑같다.
 * 하지만 변수 타입을 정해주는 것과 달리, 한 칸을 띄어 쓰는 것이 convention이다.
 * 상속을 받을 때, 부모의 생성자를 바로 생성해주어야 한다.
 */
class KotlinCat(species: String) : KotlinAnimal(species, 4) {

    override fun move() {
        println("고양이가 사뿐사뿐 걸어감")
    }
}