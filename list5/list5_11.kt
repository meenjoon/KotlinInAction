package list5

fun printProblemCounts(resposes: Collection<String>) {
    var clientErrors = 0 //람다에서 사용할 변수를 정의한다.
    var serverErrors = 0 //람다에서 사용할 변수를 정의한다.
    resposes.forEach{
        if(it.startsWith("4")){
            clientErrors++ //람다 안에서 람다 밖의 변수를 변경한다.
        }
        else if (it.startsWith("5")){
            serverErrors++ //람다 안에서 람다 밖의 변수를 변경한다.
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun salute() = println("Salute!")

fun main(args: Array<String>){
    val resposes = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    println(printProblemCounts(resposes))
    run(::salute)
    var action = { person: Person, message:String -> //이 람다는 sendEmail 함수에게 작업을 위임한다.
        sendEmail(person,message)
    }
    val nextAction = ::sendEmail //람다 대신 멤버 참조를 쓸 수 있다.
}

fun sendEmail(person: Person, message: String) {

}

