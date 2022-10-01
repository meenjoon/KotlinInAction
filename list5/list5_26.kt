package list5

import list3.joinToString

fun alphabet5() = buildString {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}


fun main(args: Array<String>){
    val canBeInClub27 = {p:Person -> p.age<=27}

    val people = listOf(Person("Alice",27), Person("Bob",31))
//    println(people.all{it.age<=27 })

    var Strings = listOf("abc","def")
//    println(Strings.flatMap { it.toList() })

    alphabet2()

}

