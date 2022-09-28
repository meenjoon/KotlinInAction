package list5

fun main(args: Array<String>){
    val canBeInClub27 = { p:Person -> p.age<=27}

    val people = listOf(Person("Alice",27), Person("Bob",31))

    println(people.count(canBeInClub27))
}