package list6

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase() //allCaps는 널일 수도 있다.
    println(allCaps)
}
fun main(args: Array<String>){
    printAllCaps("abc")
    printAllCaps(null)
}