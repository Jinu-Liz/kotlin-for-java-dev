package lec_07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class KotlinFilePrinter {

    /**
     * kotlin에서는 Checked Exception과 Unchecked Exception을 구분하지 않는다.
     * 모두 Unchecked Exception이다.
     * 따라서 별도의 throws처리를 하지 않아도 에러가 발생되지 않는다.
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /**
     * kotlin에서는 try with resources가 사라지고 use를 사용한다.
     */
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
    }
}