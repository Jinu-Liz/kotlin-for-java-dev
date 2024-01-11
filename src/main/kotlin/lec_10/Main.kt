package lec_10

fun main() {

    /**
     * 상위 클래스인 Base의 생성자가 실행되는 동안, 하위 클래스인 Derived를 인스턴스화한다는 이야기는
     * Derived의 number에 값을 집어넣어 준다는 이야기인데, 이 때 상위 클래스에서 number를 호출하게 되면
     * 하위 클래스에 있는 number를 가져오게 된다. 그러나 아직 Base의 생성자가 먼저 실행된 단계라서
     * 하위 클래스에 number라는 값에 초기화가 이루어지지 않는다.
     * 그 상태에서 하위 클래스의 number에 접근하니까 기초값인 0이 나오게 된다.
     * 그래서 상위 클래스의 생성자와 init 블럭에서는 하위 클래스의 field에 접근하면 안된다.
     *
     * 따라서, 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는
     * open을 피해야한다.
     */
    Derived(300)    // 결과 : number = 0
}

/**
 * final : default로 보이지 않게 존재하며, override를 할 수 없게 한다.
 * open : override를 열어 준다.
 * abstract : 반드시 override 해야 한다.
 * override : 상위 타입을 오버라이드 하고 있다. (java에서는 @Override를 꼭 붙이지 않아도 되나, kotlin에서는 override 지시어를 꼭 붙여야한다.)
 *
 */