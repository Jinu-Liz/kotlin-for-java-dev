package lec_12

class KotlinPerson private constructor(
    var name: String,
    var age: Int,
){

    /**
     * kotlin에서는 static이 없다.
     * 대신 companion object를 사용하여 static 변수 함수인 것처럼 사용할 수 있다.
     * companion object는 하나의 객체로 인식되며, 따라서 이름을 변경하거나 인터페이스를 구현하는 것도 가능하다.
      */
    companion object Factory : Log {
        private val MIN_AGE_R = 1     // 런타임 시 변수가 할당 된다.
        private const val MIN_AGE = 1   // const를 붙이면 컴파일 시에 변수가 할당된다. 진짜 상수를 위한 용도. 기본 타입 + String에 사용
        fun newBaby(name: String): KotlinPerson {
            return KotlinPerson(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행 객체!")
        }
    }
}