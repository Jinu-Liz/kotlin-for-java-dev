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

    // it을 사용하면 fruit -> fruit를 생략 가능하다.
    filterFruits(fruits) { it.name == "사과" }
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