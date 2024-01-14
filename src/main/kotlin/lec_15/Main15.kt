package lec_15

fun main() {

    // -- 배열 -- //
    val array = arrayOf(100, 200)
    array.plus(300)     // 배열에 element 추가

    for (i in array.indices) {  // indices = 0 ~ lastIndex 까지 Range를 만들어줌
        println("${i} ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }


    // -- list -- //
    /**
     * 우선 불변 list를 만들고, 필요한 경우에 가변 리스트로 변경하는 것이 좋다.
     * 코드도 깔끔해지고, 불필요한 가변 리스트 사용이 줄어들기 때문.
     */
    val numbers = listOf(100, 200)  // list의 경우, 기본적으로 불변(immutable)이다.
    val numbers2 = mutableListOf(100, 200)  // 따라서 가변 list를 만들려면 mutable list로 만들어주어야한다. (기본 구현체: ArrayList)
    numbers.add(300)    // 불변이기 때문에 추가할 수 없음.
    numbers2.add(300)   // 가변이기 때문에 추가 가능.

    val emptyList = emptyList<Int>()    // element 타입을 지정해주어야 함.

    // printNumbers의 매개변수에 타입이 지정되어 있으므로 별도로 타입을 지정해주지 않아도 자동으로 추론
    printNumbers(emptyList())

    // 값을 가져올 때는 두가지 모두 가능
    println(numbers.get(0))
    println(numbers[0])

    // for문의 경우, 배열과 동일
    for (number in numbers) println(number)

    for ((idx, value) in numbers.withIndex()) println("$idx $value")


    // -- set -- //
    val set = setOf(100, 200, 100)      //  list와 동일하게 불변.
    val set2 = mutableSetOf(100, 200, 100)      // 가변
    set.add(400)
    set2.add(400)


    // -- map -- //
    val oldMap = mutableMapOf<Int, String>()

    // 값을 넣을 때 2가지 방법
    oldMap.put(1, "MONDAY")
    oldMap[1] = "MONDAY"

    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")   // to 라는 중위함수를 이용하여 만들 수 있다.

    for (key in newMap.keys) {
        println(key)
        println(newMap.get(key))
        println(newMap[key])
    }

    for ((key, value) in newMap.entries) {
        println(key)
        println(value)
    }


    // -- null 가능성 -- //
    val list1 : List<Int?> = mutableListOf()    // 리스트에 null이 들어갈 수 있지만, 리스트는 null이 아님
    val list2 : List<Int>? = mutableListOf()    // 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
    val list3 : List<Int?>? = mutableListOf()   // 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음


    /**
     * java의 경우, 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않는다.
     * 따라서, kotlin의 불변 list를 가져간 후에 element를 추가할 수 있다.
     * 추가한 이후, kotlin에 되돌려주는 경우 오동작을 일으킬 수 있다.
     * 또한 java는 nullable / non-nullable 타입을 구분하지 않기 때문에
     * non-nullable 리스트를 가져간 후, null을 추가하고 돌려줄 수 있다.
     * 이런 경우, 또 에러가 날 수 있다.
     * 따라서 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안하여 방어로직을 짜거나
     * 코틀린 쪽에서 Collections.unmodifableXXX()를 활용하여 변경 자체를 막아야한다.
     *
     * 또한 java 컬렉션을 사용할 때, 플랫폼 타입을 신경써야 한다. ( List<Int?> / List<Int>? / List<Int?>? )
     * 따라서 java코드를 보고, 맥락을 확인하여 가져오는 지점을 wrapping 해야한다. (영향범위 최소화)
     */
}

private fun printNumbers(numbers: List<Int>) {

}