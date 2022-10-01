package list5
fun alphaber() : String {
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNow I know the alphaber!")
    return result.toString()
}

fun main(args: Array<String>){
    println(alphaber())
}