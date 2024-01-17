package lec_18

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1000, 2000),
        Fruit(2, "사과", 1200, 3000),
        Fruit(3, "사과", 1200, 3000),
        Fruit(4, "사과", 1500, 4000),
        Fruit(5, "바나나", 3000, 6000),
        Fruit(6, "바나나", 3200, 7000),
        Fruit(7, "바나나", 2500, 8000),
        Fruit(8, "수박", 10000, 20000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // index가 포함된 filter
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // 사과의 현재 가격들만 꺼낼 때
    val applePrice = apples.map { fruit -> fruit.currentPrice }

    // index가 포함된 map
    val applePrice2 = apples.mapIndexed { idx, fruit ->
        println(idx)
        fruit.currentPrice
    }

    // null이 아닌 것만 가져오고 싶을 경우
    val notNullApples = apples.mapNotNull { fruit -> fruit.nullOrValue() }

    filterFruits(fruits) { fruit -> fruit.name == "사과" }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)    // filter함수 바로 넣어줄 수 있음.
}