package lec_20

fun main() {
    val person = Person("지누리즈", 200)
    val view = View()

    // 1번 코드
    if (person != null && person.isAdult()) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    // 2번 코드 (scope function을 활용한 코틀린스러운 코드)
    person?.takeIf { it.isAdult() }
        ?.let { view::showPerson }
        ?: view.showError()

    /**
     * 1. 2번 코드는 숙련된 코틀린 개발자만 더 알아보기 쉽다.
     * 숙련된 코틀린 개발자도 잘 이해하지 못할 수 있다.
     *
     * 2. 1번 코드가 디버깅이 쉽다.
     *
     * 3. 1번 코드가 수정도 더 쉽다.
     *
     * 따라서 가독성 및 유지보수 측면에서 1번 코드가 더 좋다.
     *
     * 사용 빈도가 적은 관용구는 코드를 더 복잡하게 만들고
     * 이런 관용구들을 한 문장 내에서 조합해 사용하면 복잡성이 훨씬 증가한다.
     */
}