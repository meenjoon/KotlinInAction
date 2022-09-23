package list3

import java.lang.StringBuilder

fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String =""
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index>0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
fun main(args : Array<String>){
    val list = listOf(1,2,3)
//    println(joinToString2(list, ",", "", ""))
//    println(joinToString2(list)) //separator, prefix, postfix 생략
//    println(joinToString2(list, "; ")) //separator를 "; "로 지정, prefix와 postfix todfir
    println(joinToString2(list, postfix=";", prefix="# "))
}