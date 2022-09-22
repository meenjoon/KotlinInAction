package list2

fun main(args: Array<String>) {
    val name = if (args.size >0) args[0] else "안녕"
    println("Hello, $name!")

    println("Hello, ${if(args.size>0) args[0] else "someone"}!")

//    if (args.size>0) {
//        println("Hello, ${args[0]}!")
    }
