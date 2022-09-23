package strings

import strings.lastChar
import  strings.*
import  strings.lastChar as last // as 키워드를 사용하여 임포트한 클래스나 함수를 다른 이름으로 부를 수 있다.

fun String.lastChar() : Char = this.get(this.length -1)

fun String.lastChar2(name:String,Age:Int) : Char = this.get(this.length -1)

fun main(args : Array<String>){
    println("Kotlin".lastChar())
    println("Kotlin".lastChar2("asf",22))
}