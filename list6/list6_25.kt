package list6

import java.io.BufferedReader
import java.io.StringReader

fun <T> copyElemets(source: Collection<T>, target: MutableCollection<T>) {
    for(item in source){ //source 컬렉션의 모든 원소에 대해 루프를 돈다.
        target.add(item) // 변경 가능한 target 컬렉션에 원소를 추가한다.
    }
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElemets(source, target)
    println(target)
}
