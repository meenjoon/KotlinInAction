package list6

fun main(args: Array<String>) {
    val letters = Array<String>(26) { i-> ('a'+i).toString()}
    println(letters.joinToString(""))
}