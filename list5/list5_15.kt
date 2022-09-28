package list5

fun main(args: Array<String>){
    var list = listOf("a","ab","b")
    println(list.groupBy(String::first))

}