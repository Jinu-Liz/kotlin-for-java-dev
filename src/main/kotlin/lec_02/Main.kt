package lec_02

fun main() {
    // null이 들어갈 수 있을 때 에러 발생. (safe call)
    val str: String? = "ABC"
    str.length  // 불가능
    str?.length // 가능

    val str2: String? = null
    println(str2?.length) // safe call은 null이 아니면 뒤에 걸 실행, null이면 전체 값이 null이 됨.

    val str3: String? = null
    println(str3?.length ?: 0) // Elvis 연산자. (앞의 연산 결과가 null이면 뒤의 값을 사용)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }

    return str.startsWith("A")
}

fun startsWithA1_kt(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) return  null

    return str.startsWith("A")
}

fun startsWithA2_kt(str: String?): Boolean? {

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) return false

    return str.startsWith("A")   // 위에 null을 감지하는 로직이 없으면, str에 null이 들어갈 수 있으므로 에러 발생 (safe call)
}

fun startsWithA3_kt(str: String?): Boolean {

    return str?.startsWith("A") ?: false
}

// null 아님 단언. null이 결코 발생할 수 없다고 생각되는 경우 사용한다. null이 들어오면 런타임 에러 발생.
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}