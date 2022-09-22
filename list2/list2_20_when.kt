package list2

class list2_20_when {
}

fun eval3(e: Expr) : Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval3(e.left) + eval3(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main(args:Array<String>){
    println(eval3(Sum(Num(3),Num(6))))
}