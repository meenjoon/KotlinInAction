package list3

import strings.lastChar
import strings.lastChar2
import java.lang.StringBuilder

fun<T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String =  "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String =  "",
    postfix: String = ""
) = joinToString(separator,prefix,postfix)

fun main(args : Array<String>){
    val list = listOf(1,2,3)
    val list2 = listOf("one","tow","three")

//    println(list.join()) // 컴파일 오류 발생
    println(list2.join())

    val arraylist = arrayListOf(1,2,3)
    println(list.joinToString(separator = "; ", prefix = "", postfix = "" ))
    println(arraylist.joinToString(separator = "; ", prefix = "", postfix = "" ))
}
