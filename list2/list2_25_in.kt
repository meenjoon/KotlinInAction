package list2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'






//    var percentage =
//       if(number in 0..100)
//            number
//        else
//            throw IllegalArgumentException(
//                "A percentage value must be between 0 and 100: $number")





fun recognize(c:Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't Know..."
}
fun readNumber(reader: BufferedReader) : Int ? { // 함수가 던질 수 있는 예외를 명시할 필요가 없다.
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) { // 예외타입을 :의 오른쪽에 쓴다.
        return null
    }
    finally { // finally는 자바와 똑같이 작동한다.
        reader.close()
    }
}

fun main(args :Array<String>){
//    println(isLetter('a'))
//    println(isNotDigit('3'))
//    println(recognize('3'))
//    println("Kotlin" in setOf("Java","Scala"))
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}