package lec_11

class Car(
    val name: String,
    var owner: String,
    _price: Int
) {
    var price = _price
        private set // setter에만 추가로 가시성을 부여할 수 있다.
}