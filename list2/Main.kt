package list2

import kotlin.math.max

fun main(args: Array<String>) {
    println( max(10, 20));
//    var answer = 42
//    answer = "no answer" // "Error: type mismatch" 컴파일 오류 발생

//    fun max(a:Int , b:Int)  = if(a>b) a else b

    fun max(a: Int, b: Int): Int {


        return if (a > b) a else b
    }
}
