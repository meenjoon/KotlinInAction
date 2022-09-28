package list2

class Person(var name: String, //읽기 전용 프로퍼티로, 코틀린은(비공개)필드와 필드를 읽는 단순한 (공개) 게터를 만들어낸다.
             var age: Int// 쓸 수 있는 프로퍼티로, 코틀린은 (비공개)필드, (공개) 게터, (공개) 세터를 만들어낸다.

) {

}

fun main(args:Array<String>) {
    val Person = Person("Bob",11)
    val Color = Color.BLUE.rgb()
    println(Color)
    println(Person.name)
//    println(Person.isMarried)
//    Person.isMarried=false;
    Person.name="setter"
}