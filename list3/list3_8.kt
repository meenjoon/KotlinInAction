package list3

import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char) {
        this.setCharAt(length-1,value)
    }
fun main(args : Array<String>){
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
