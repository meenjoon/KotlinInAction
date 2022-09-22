package list2

import java.lang.IllegalArgumentException

class list2_21_when {
}
fun evalWithLogging(e: Expr) : Int =
    when(e) {
        is Num -> {
            println("num : ${e.value}")
            e.value // 이 식이 블록의 마지막 식이므로 e의 타입이 Num이면 e.value가 반환된다.
        }
        is Sum -> {
            val left = evalWithLogging( e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unkown expression")

    }
fun main(args:Array<String>){
    println(evalWithLogging(Sum(Sum(Num(1),Num(2)),Num(4))))
}