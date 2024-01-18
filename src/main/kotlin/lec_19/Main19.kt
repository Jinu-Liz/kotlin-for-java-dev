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



    val person = Person("지누리즈", 100)

    /**
     * 구조 분해하여 name과 age라는 변수를 한 번에 선언하고 값을 가져올 수 있다. (순서대로)
     * Data class는 componentN이라는 함수를 자동으로 만들어 준다.
     *
     * val name = person.component1()
     * val age = person.component2()
     *
     * 와 동일하다고 할 수 있다.
     */
    val (name, age) = person
    println("이름 : ${name}, 나이 : ${age}")

    /**
     * 단순히 순서대로 넣기 때문에
     *
     * 이름 : 100, 나이 : 지누리즈
     *
     * 라는 결과가 나오게 된다.
     */
    val (age2, name2) = person
    println("이름 : ${name2}, 나이 : ${age2}")

    // 일반 Class인 경우에는 componentN 함수가 없기 때문에 에러가 발생한다.
    val person2 = NoDataPerson("지누리즈", 200)
    val (name3, age3) = person2


    // componentN 함수를 만들어주게되면 에러없이 사용할 수 있다.
    val person3 = NoDataPerson2("지누리즈", 200)
    val (name4, age4) = person3


    // forEach 등의 문법 안에서는 break / continue를 사용 할 수 없다.
    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { number ->
            if (number == 3) continue
            println(number)
        }

    // 그러나 break문을 굳이 써야하겠다고 하면 run함수와 return@run을 사용하면 된다.
    run {
        numbers.map { number -> number + 1 }
            .forEach { number ->
                if (number == 3) return@run
                println(number)
            }
    }

    // continue를 사용하고 싶은 경우에는 return@forEach를 사용하면 된다.
    numbers.map { number -> number + 1 }
        .forEach { number ->
            if (number == 3) return@forEach
            println(number)
        }

    /**
     * 그러나 break, continue를 사용할 경우에는
     * 가급적 익숙한 for문을 사용하는 것이 좋다.
     * 코드를 읽는 사람이 이해하기 쉽고, 작성하는 사람도 잘못된 프로그래밍의 가능성을
     * 막을 수 있기 때문.
     */
}