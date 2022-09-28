package list5

class list5_4 {
}
fun main(args: Array<String>){
    val createPerson = ::Person //Person의 인스턴스를 만드는 동작을 값으로 저장한다.
    val p = createPerson("Alcie",29)

    val predicate = p::isAdult
    println(p::isAdult)
}
fun Person.isAdult() = age >= 21

