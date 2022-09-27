package list4

import list2.Person
import kotlin.reflect.KProperty

class Client4(val name: String, val postalCode: Int){
    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client4(name, postalCode)
//    override fun toString(): String = "Client(name=$name, postalcode=$postalCode)"
}
class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()


    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}
class DelegatingCollection2<T> (
        innerList: Collection<T> = ArrayList<T>()
        ) : Collection<T> by innerList{}

class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { //MultableCollection의 구현을 innerSet에게 위임한다.
    var objectAdded = 0
    override fun add(element: T): Boolean { //이 두 메서드는 위임하지 않고 새로운 구현을 제공한다.
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean { //이 두 메서드는 위임하지 않고 새로운 구현을 제공한다.
        objectAdded +=elements.size
        return innerSet.addAll(elements)
    }
}

object Payroll {


    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        for (person in allEmployees){
            println(person)
        }
    }
}


interface Speaker {
    var subject: String
    val script: String
    fun say()

}

class DroidKnights : Speaker {
    override var subject = "Jetpack Compose 내부 작동 원리"
    override val script = """
        안녕하세요, 저는 $subject 에 대해 발표할 지성빈 입니다.
        Jetpack Compose 는 작년 7월달에 stable 로 출시되었습니다.
        ...
    """.trimIndent()

    override fun say() {
        println("[$subject] $script")
    }


}

//class Sungbin(private val presentation: Speaker) : Speaker {
//    override val subject = presentation.subject
//    override val script = presentation.script
//    override fun say() {
//        presentation.say()
//    }
//}

class SungbinBy(presentation: Speaker) : Speaker by presentation{




}

class CustomString {
    private var value = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>) = "[CustomString] $value"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
    }
}


val nameMap = mutableMapOf(
    "first" to "Ji",
    "second" to "Sung",
    "last" to "bin"
)

class NameBy {
    var first by nameMap
    var second by nameMap
    var last by nameMap
    fun print() {
        println(listOf(first, second, last))
    }
}



fun main(args: Array<String>){
//    val cset = CountingSet<Int>()
//    cset.addAll(listOf(1,2,2))
//    println("${cset.objectAdded} objects were added, ${cset.size} remain")
//    Payroll.allEmployees.add(addPerson("secret",false))
//    Payroll.allEmployees.add(Person("secret2",false))
//    Payroll.calculateSalary()


    val DroidKnights = DroidKnights()
////    val Sungbin = Sungbin(DroidKnights)
    val SungbinBy = SungbinBy(DroidKnights)
    SungbinBy.subject="asd"
    println(SungbinBy.subject)

//    var customString by CustomString()
//    customString = "Bye, world."
//    println(customString)

//    val nameBy = NameBy()
//    nameBy.print()

}
