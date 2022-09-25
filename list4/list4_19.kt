package list4

class Client3(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean { //"Any"는 java.lang.Object에 대응하는 클래스로, 코틀린의 모든 클래스의 최상위 클래스다. "Any?"는 널이 될 수 있는 타입이므로 "other"는 null일 수 있다.
        if(other == null || other !is Client3) // "other"가 Client인지 검사한다.
            return false
        return name == other.name && // 두 객체의 프로퍼티 값이
                postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    override fun hashCode(): Int =
        name.hashCode() * 31 + postalCode
}
fun main(args: Array<String>){
    val processed = hashSetOf(Client3("오현석",4122))
    println(processed.contains(Client3("오현석",4122)))
}