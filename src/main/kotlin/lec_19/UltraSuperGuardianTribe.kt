package lec_19

data class UltraSuperGuardianTribe(
    val name: String
)

// 이름이 긴 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있다.
typealias USGTMap = Map<String, UltraSuperGuardianTribe>