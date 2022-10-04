package list6

data class Person6(val name: String,
                  val age: Int? = null) {
    fun isOlderThan(other: Person6): Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        return age > other.age
    }
}

fun main(args: Array<String>){
    val i = 1
//    val l: Long = i
    println(Person6 ("Sam", 35).isOlderThan (Person6 ("Amy", 42)))
    println(Person6 ("Sam", 35).isOlderThan (Person6 ("Amy")))
}
