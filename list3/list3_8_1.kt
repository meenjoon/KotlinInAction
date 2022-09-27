package list3

import java.lang.StringBuilder

fun main(args : Array<String>){
//    val list2 = listOf(1,2,3)
//    val list = listOf("args: ",*list2.listIterator())
    println(list)

//    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".","-"))
}