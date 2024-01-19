package lec_20

data class Person(
    val name: String,
    var age: Int
) {
    fun getNumberOrNull(): Int? {
        return if (age <= 0) {
            null
        } else {
            age
        }
    }

    // 주어진 조건을 만족할 경우에는 그 값이, 그렇지 않으면 null이 반환된다.
    fun getNumberOrNull2(): Int? {
        return age.takeIf { it > 0 }
    }

    // 주어진 조건을 만족하지 않는 경우에는 그 값이, 그렇지 않으면 null이 반환된다.
    fun getNumberOrNull3(): Int? {
        return age.takeUnless { it <= 0 }
    }

    fun growOld() {
        age += 1
    }
}

class Person2(
    val name: String,
    val age: Int,
    var hobby: String
)

class PersonRepository() {
    fun save(person: Person) {
        println("save")
    }
}