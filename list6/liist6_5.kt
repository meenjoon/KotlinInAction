package list6

fun strLenSafe3(s:String?): Int = s?.length ?: 0

fun main(args: Array<String>){
    println(strLenSafe3("abc"))
    println(strLenSafe3(null))
}