package list2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber2(reader: BufferedReader) { // 함수가 던질 수 있는 예외를 명시할 필요가 없다.
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
//        return
        null
    }
    println(number)
}
fun main(args :Array<String>){
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}

