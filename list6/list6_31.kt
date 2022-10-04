package list6

fun main(args: Array<String>) {
    val strings = listOf("a","b","c")
    println("%s/%s/%s".format(*strings.toTypedArray()))//varag 인자를 넘기기 위해 스프레드 연산자(*)를 써야 한다.
}