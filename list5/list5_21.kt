package list5

/* 자바 */
fun postponeComputation(delay: Int, computation: Runnable?) {}

fun handleComputation(id: String) { //람다 안에서 "id" 변수를 포획한다.
    postponeComputation(1000) { println(id) } // handleComputation을 호출할 때마다 새로 Runnable 인스턴스를 만든다.

}

