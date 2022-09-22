package list2

import java.util.*

val binaryReps = TreeMap<Char, String>() // 키에 해 정렬하기 위해 TreeMap을 사용한다.

val list = arrayListOf("10","11","1001")
fun listindex() {
    for((index, element) in list.withIndex()){
        println("$index: $element")
    }
}



fun mapex() {
    for (c in 'A'..'F') { //A부터 F까지 문자의 범위를 사용해 이터레이션한다.
        val binary = Integer.toBinaryString(c.toInt()) // 아스키 코드를 2진 표현으로 바꾼다.

        binaryReps[c] = binary //c를 키로 c의 2진 표현을 맵에 넣는다.
        println(binaryReps)
    }
    for((letter,binary) in binaryReps) { // 맵에 대해 이터레이션한다. 맵의 키와 값을 두 변수에 각각 대입한다.
        println("$letter = $binary")

    }
}
fun main(args :Array<String>){
//    mapex()
    listindex()
}
