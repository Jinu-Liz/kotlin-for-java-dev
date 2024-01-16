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
}