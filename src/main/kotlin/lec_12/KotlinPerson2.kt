package lec_12

class KotlinPerson2 private constructor(
    var name: String,
    var age: Int,
){

    companion object {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): KotlinPerson2 {
            return KotlinPerson2(name, MIN_AGE)
        }
    }
}