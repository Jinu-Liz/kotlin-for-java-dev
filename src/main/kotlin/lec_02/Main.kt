package lec_02

fun main() {
    // null이 들어갈 수 있을 때 에러 발생. (safe call)
    val str: String? = "ABC"
    str.length  // 불가능
    str?.length // 가능
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }

    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) return  null

    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) return false

    return str.startsWith("A")   // 위에 null을 감지하는 로직이 없으면, str에 null이 들어갈 수 있으므로 에러 발생 (safe call)
}