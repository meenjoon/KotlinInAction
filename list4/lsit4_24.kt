package list4

import java.io.File

data class Person(val name: String){
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int =
            o1.name.compareTo(o2.name)
    }
}
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }

    }
}

fun main(args: Array<String>){
    A.bar()

}