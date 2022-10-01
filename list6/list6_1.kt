package list6

fun strLenSafe2(s: String?): Int = if(s != null) s.length else 0

fun main(args: Array<String>){
    val x : String? = null
    println(strLenSafe2(x))
    println(strLenSafe2("abc"))
}
