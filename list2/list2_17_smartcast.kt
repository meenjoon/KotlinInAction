package list2

import java.lang.IllegalArgumentException

interface Expr

class Num(var value: Int) : Expr //value라는 프로퍼티만 존재하는 단순한 클래스로 Expr 인터페이스를 구현한다.
class Sum(var left : Expr, var right:Expr) : Expr //Expr 타입의 객체라면 어떤 것이나 Sum 연산의 인자가 될 수 있다. 따라서 Num이나 다른 Sum이 인자로 올 수 있다.

fun eval(e: Expr) : Int{
    if(e is Num){

        val n = e as Num // Num 타입으로 변환하는데, 이는 불필요한 중복이다.
        return n.value
    }
    if(e is Sum){

        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args:Array<String>){
//    println(Sum(Sum(Num(1),Num(2)),Num(4)))
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}