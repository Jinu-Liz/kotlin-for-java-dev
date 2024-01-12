package lec_11

// 코틀린에서는 파일 상단에 함수를 선언한 후에, util처럼 사용하면 편함
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}