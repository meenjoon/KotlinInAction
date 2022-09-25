package list4

import javax.naming.Context
import javax.swing.text.AttributeSet

sealed class Expr2 { //기반 클래스를 sealed로 봉인한다.
    class Num(val value: Int) : Expr2() //기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
    class Sum(val left: Expr2, val right: Expr2) : Expr2() //기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
}
fun eval(e: Expr2): Int =
    when(e) { //when식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
        is Expr2.Num -> e.value
        is Expr2.Sum -> eval(e.right) + eval(e.left)

    }
class User(val nickname: String,
           val isSubcribed: Boolean = true) //생성자 파라미터에 대한 디폴트값(기본값)을 제공한다.

fun main(args: Array<String>) {
    val hyun = User("현석") //isSubscribed 파라미터에는 디폴트 값이 쓰인다.
    println(hyun.isSubcribed)
    val gye = User("계영",false) //모든 인자를 파라미터 선언 순서대로 지정할 수도 있다.
    println(gye.isSubcribed)
    val hey = User("혜원",isSubcribed = false) // 생성자 인자 중 일부에 대해 이름을 지정할 수 있다.
    println(hey.isSubcribed)
}

class Sercretive private constructor() {}

open  class View3{
    constructor(ctx: Context){ //부 생성자
        //코드
    }
    constructor(ctx: Context, attr:AttributeSet){ //부 생성자
        //코드
    }
}

class MyButton : View3 {
    constructor(ctx: Context)
        :super(ctx) { //이 클래스의 다른 생성자에게 위임한다.
        //..
    }
    constructor(ctx: Context, attr: AttributeSet)
        :super(ctx,attr){
            //..
        }
}