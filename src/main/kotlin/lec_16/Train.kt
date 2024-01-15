package lec_16

open class Train(
    val name: String = "새마을호",
    val price: Int = 5000,
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")

    return this.price >= 10000
}

class Srt : Train("SRT", 40000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")

    return this.price >= 10000
}