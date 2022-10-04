package list6

fun verifyUserInput(input: String?) {
    if(input.isNullOrBlank()) { //안전한 호출을 하지 않아도 된다.
        println("Please fill in the required fileds")
    }
}

fun main(args: Array<String>){
    verifyUserInput(" ")
    verifyUserInput(null) //isNullOrBlank에 "null"을 수신 객체로 전달해도 아무런 예외가 발생하지 않는다.

}