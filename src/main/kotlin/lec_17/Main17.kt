package lec_17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    // 함수 이름없이 바로 파라미터 / 리턴타입 / 본문이 들어감.
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다 방식 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 람다를 직접 호출하는 방법
    isApple(fruits[0])

    // invoke를 사용하여 명시적으로 작성할수도 있음.
    isApple.invoke(fruits[0])


    // 함수에 타입을 지정할 수 있다. (Fruit를 받고, Boolean을 반환)
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple4: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // Fruit를 변수로 받고, Boolean을 반환하는 함수를 타입으로 받기 때문에 함수를 매개변수로 넘길 수 있다.
    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)

    // 소괄호 안에 중괄호가 들어가 있는 것이 어색하기 때문에 밖으로 뺄 수 있다.
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })

    // 밖으로 뺀 형태
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }

    // 타입을 추론 가능하기 때문에 생략 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }

    // it을 사용하면 람다의 파라미터를 직접 참조할 수 있다. 그러나 이 방법은 어떤 값이 넘어왔는지 알 수 없으므로 비추천.
    filterFruits(fruits) { it.name == "사과" }


    /**
     * java에서는 final이 아닌 변수는 람다에서 사용할 수 없으나,
     * kotlin에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
     * 따라서, 바나나 -> 수박으로 바뀌어도 아무 문제 없이 사용할 수 있다.
     * 이렇게 해야만 람다를 진정한 1급 시민으로 간주할 수 있으며, 이러한 데이터 구조를 Closure라고 부른다.
     */
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) results.add(fruit)
    }

    return results
}