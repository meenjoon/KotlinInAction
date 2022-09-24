package list4

sealed class Expr2 { //기반 클래스를 sealed로 봉인한다.
    class Num(val value: Int) : Expr2() //기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
    class Sum(val left: Expr2, val right: Expr2) : Expr2() //기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
}
fun eval(e: Expr2): Int =
    when(e) { //when식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
        is Expr2.Num -> e.value
        is Expr2.Sum -> eval(e.right) + eval(e.left)

    }