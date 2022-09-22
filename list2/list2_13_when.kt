package list2

class list2_13_when {
}

fun getWarmth(color: Color) =
    when (color){
        Color.RED, Color.ORANGE, Color.YELLOW -> "warn"
        Color.GREEM -> "netural"
        Color.BLUE,Color.INDIGO,Color.VIOLET->"cold"
    }

fun main(args:Array<String>){
    println(getWarmth(Color.BLUE))
}