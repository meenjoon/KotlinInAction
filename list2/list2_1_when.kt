package list2

class list2_1_when {
}
fun getMneonic(color: Color) =
    when (color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEM -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args:Array<String>){
    println(getMneonic(Color.BLUE))
}