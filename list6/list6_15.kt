package list6

fun <T> printHashCode(t: T){
    println(t?.hashCode())//"t"가 null이 될 수 있으므로 안전한 호출을 써야만 한다.
}

fun main(args: Array<String>){
    printHashCode(null) //"T"의 타입은 "Any?"로 추론된다.
}