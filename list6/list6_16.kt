package list6

fun <T:Any> printHashCode2(t: T){
    println(t.hashCode())//이제 "T"는 널이 될 수 없는 타입이다.
}

fun main(args: Array<String>){
//    printHashCode2(null) //이 코드는 컴파일 되지 않는다. 널이 될 수 없는 타입의 파라미터에 널을 넘길 수 없다.
    printHashCode2(42)
}