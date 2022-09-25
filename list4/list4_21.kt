package list4

import list2.Person

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
) : MutableCollection<T> by innerSet{ //MultableCollection의 구현을 innerSet에게 위임한다.
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


fun main(args: Array<String>){
//    val cset = CountingSet<Int>()
//    cset.addAll(listOf(1,2,2))
//    println("${cset.objectAdded} objects were added, ${cset.size} remain")
    Payroll.allEmployees.add(Person("secret",false))
    Payroll.allEmployees.add(Person("secret2",false))
    Payroll.calculateSalary()
}
