package lec_14

/**
 * sealed class
 * 상속이 가능한 계층 구성을 하고 싶지만, 외부에서 해당 클래스를 상속받지 않았으면 좋겠다는 니즈에서 탄생.
 * 하위 클래스는 같은 패키지에 있어야하며, 컴파일 타임 때 하위 클래스 타입을 모두 기억하여,
 * 런타임 때 클래스 타입이 추가될 수 없다.
 * 1. 클래스를 상속받을 수 있다는 점
 * 2. 하위 클래스는 멀티 인스턴스가 가능하다는 점
 * 에서 Enum과 다르다.
 */
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1000L)

class Sonata : HyundaiCar("소나타", 2000L)

class Grandeur : HyundaiCar("그렌저", 3000L)