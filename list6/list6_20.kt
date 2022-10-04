package list6

fun foo(l: Long) = println(l)

fun main(args: Array<String>){
    val b: Byte = 1 //상수 값은 적절한 타입으로 해석된다.
    val l = b + 1L // +는 Byte와 Long을 인자로 받을 수 있다.
    foo(42) // 컴파일러는 42를 Long 값으로 해석한다.
}