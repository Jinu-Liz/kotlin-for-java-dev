package lec_19

import lec_19.a.printHelloWorld as printHelloworldA
import lec_19.b.printHelloWorld as printHelloworldB

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {}

// filter의 타입이 너무 길 경우, 별칭을 주어 변수로 만들 수 있다.
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter) {}

fun main() {
    // 다른 패키지의 같은 이름의 함수를 사용하고 싶은 경우, import와 동시에 이름을 바꿀 수 있다.
    printHelloworldA()
    printHelloworldB()
}