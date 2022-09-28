package list5

 class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>){
    var book = listOf( Book("Thursday Next", listOf("Jasper Eforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett","Neil Gaiman")))
    println( book.flatMap { it.authors}.toSet())


    var Strings = listOf("abc","def")
    println(Strings.flatMap { it.toList() })
}