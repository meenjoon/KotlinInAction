package list5

fun main(args: Array<String>){
//    val list = listOf(1,2,3,4)
//    println(list.filter { it % 2 ==0 })

    val people = listOf(Person("Alice",29), Person("Bob",31))
//    println(people.filter { it.age>30 })
//
//    println(list.map { it*it })
//
//    println(people.map { it.name })
    var aa = people.map(Person::name)
    println(aa)
    var bb = people.filter { it.age>30 }.map ( Person::name )
    println(bb)

    var cc = people.filter { it.age == people.maxBy(Person::age)!!.age }
    val maxAge = people.maxBy(Person::age)!!.age
    people.filter { it.age==maxAge }

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
}