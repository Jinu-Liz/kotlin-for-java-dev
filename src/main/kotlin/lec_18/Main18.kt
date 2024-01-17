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

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1000, 2000),
            Fruit(2, "사과", 1200, 3000),
            Fruit(3, "사과", 1200, 3000),
            Fruit(4, "사과", 1500, 4000),
        ),
        listOf(
            Fruit(5, "바나나", 3000, 6000),
            Fruit(6, "바나나", 3200, 7000),
            Fruit(7, "바나나", 2500, 8000),
        ),
        listOf(
            Fruit(8, "수박", 10000, 20000),
        )
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


    // 조건을 모두 만족하면 true
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // 조건을 모두 불만족하면 true
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    // 조건을 하나라도 만족하면 true
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 10000 }

    // 개수 count (java의 size()와 동일)
    val fruitCnt = fruits.count()

    // 조건으로 정렬(오름차순)
    val sortedFruit = fruits.sortedBy { fruit -> fruit.currentPrice }

    // 조건으로 정렬(내림차순)
    val descFruit = fruits.sortedByDescending { fruit -> fruit.currentPrice }

    // 중복값 제거
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }

    // 첫 번째 값을 가져온다. (무조건 null이 아니어야함)
    fruits.first()

    // 마지막 값을 가져온다. (무조건 null이 아니어야함)
    fruits.last()

    // 첫 번째 값 또는 null을 가져온다.
    fruits.firstOrNull()

    // 마지막 값 또는 null을 가져온다.
    fruits.lastOrNull()
}