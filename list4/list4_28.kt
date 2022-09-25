package list4

interface JSONFacntory<T> {
    fun fromJson(jsonText: String) : T
}
class Person3(val name: String) {
    companion object : JSONFacntory<Person3> {
        override fun fromJson(jsonText: String): Person3 { //동반 객체가 인터페이스를 구현한다.
            TODO("Not yet implemented")
        }
    }
}