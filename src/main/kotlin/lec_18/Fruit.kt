package lec_18

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
) {
    fun nullOrValue(): Int? {
        return id.toInt()
    }
}