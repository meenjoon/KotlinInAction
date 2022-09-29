package list5



fun main(args: Array<String>){

    val list2 = listOf(1, 2, 3, 4).asSequence().map { print("map($it)"); it*it }
        .filter { print("filter($it)"); it % 2==0 }.toList()
    println(list2)
    println(listOf(1, 2, 3, 4).asSequence().map { it*it }.find { it>3 })

}