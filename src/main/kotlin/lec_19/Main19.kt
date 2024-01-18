package lec_19


fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {}

// filter의 타입이 너무 길 경우, 별칭을 주어 변수로 만들 수 있다.
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter) {}