package list6

fun main(args: Array<String>) {
    val squares = IntArray(5) { i-> (i+1) * (i+1) }
    println(squares.joinToString())
}