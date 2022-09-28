import list3.joinToString
import list5.Person

fun findTheOldest(people: List<Person>) {
    var maxAge = 0 //< ----- 가장 많은 나이를 저장한다.
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}
fun main(args: Array<String>) {
    val people2 = listOf(Person("Alice", 29), Person("Bob", 31))
    var list = listOf(1, 2, 3)
    println(list.maxBy { it })
    println(people2.maxBy { it.age })
    println(people2.maxBy(Person::age))
//    val sum = { x: Int, y: Int -> x + y}
//    println(sum(5, 7))


    run { println(42) }
    people2.maxBy() { p: Person -> p.age }

    val names = people2.joinToString(separator = " ",
        transform = { p: Person -> p.name })
    println(names)

    people2.maxBy { p: Person -> p.age } //파라미터 타입을 명시
    people2.maxBy { p -> p.age } //파라미터 타입을 생략(컴파일러가 추론)

    val getAge = { p: Person -> p.age }
    people2.maxBy(getAge)





}

