package lec_19

class NoDataPerson(
    val name: String,
    val age: Int
)
class NoDataPerson2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}