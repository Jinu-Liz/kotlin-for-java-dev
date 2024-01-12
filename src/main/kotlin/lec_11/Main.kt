package lec_11

/**
 * kt 파일에는 변수, 함수, 클래스 모두 선언할 수 있다. (JS랑 같음)
 */

val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat public constructor()  // public이 생략되어 있음. 다른 접근 제어 지시어를 사용하려면 constructor가 필수.


/**
 * kotlin 지시어
 *
 * public - 기본값. 어디서든 접근 가능
 * protected - 파일(.kt)에는 사용 불가능
 * internal - 같은 모듈에서만 접근 가능
 * private - 같은 파일에서만 접근 가능
 */


/**
 * java와 kotlin을 함께 사용할 때 주의할 점
 * kotlin의 internal의 경우, 바이트 코드에서 public으로 변환되므로
 * java에서 kotlin 모듈의 internal 코드를 가져올 수 있다.
 *
 * kotlin의 protected와 java의 protected는 다르다. (kotlin에서는 같은 패키지에서만의 접근이라는 개념이 없다.)
 * 따라서, java는 같은 패키지에서의 kotlin protected 멤버에만 접근 가능하다.
 */