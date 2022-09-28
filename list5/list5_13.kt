package list5

fun main(args: Array<String>){
    val list = listOf(1,2,3)
    println(!list.all { it==3 }) // 아래의 조건의 부정에 대해 any와 같다.
    println(list.any { it !=3 }) //위의 all 부정과 같다.
}