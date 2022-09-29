package list5

fun main(args: Array<String>){
    val people = listOf(Person("Alice",27), Person("Bob",31),Person("Dan",21))
    println(people.asSequence().map(Person::name).filter { it.length<4 }.toList()) //map 다음에 filter 수행
    println(people.asSequence().filter { it.name.length<4 }.map { Person::name }.toList()) //filter 다음에 map 수행
}