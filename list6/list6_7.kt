package list6

class Person(val firstName: String, val lastName: String){
//    override fun equals(other: Any?): Boolean {
//        val otherPerson3 = other as? Person3 ?: return false //타입이 서로 일치하지 않으면 false를 반환한다.
//
//        return otherPerson3.firstName == firstName && //안전한 캐스트를 하고나면 otherPerson이 Person 타입으로 스마트 캐스트 된다.
//                otherPerson3.lastName == lastName
//    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 37 + lastName.hashCode()
    }
}

fun main(args: Array<String>){
//    val p1 = Person3("Dmitry", "Jemerov")
////    val p2 = Person3("Dmitry", "Jemerov")
//    println(p1 == p2) //== 연산자는 오버라이드 하기 전 "equals" 메소드를 호출한다. 즉, heap영역의 주소값을 비교
//    println(p1.equals(42)) //override한 equals를 호출
}