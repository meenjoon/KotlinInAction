package list5

fun main(args: Array<String>){
    val naturalNumbers = generateSequence(0) {it + 1}
    val nubersTo100 = naturalNumbers.takeWhile { it <=100 }
    println(nubersTo100.sum())
}