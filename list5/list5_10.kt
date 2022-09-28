package list5

fun printMessageWithPrefix(messages: Collection<String>, prefix:String){
    messages.forEach{// 각 원소에 대해 수행할 작업을 람다로 받는다.
        println("$prefix $it") //람다 안에서 함수의 "prefix" 파라미터를 사용한다.
    }
}
fun main(args: Array<String>){
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors,"Error:")
}