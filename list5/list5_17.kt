package list5



fun main(args: Array<String>){
    val people = listOf(Person("Alice",27), Person("Bob",31)) //원본 컬렉션을 시퀀스로 변환한다.
    println( people.asSequence().map(Person::name) //시퀸스도 컬렉션과 똑같은 API를 제공한다.
        .filter { it.startsWith("A") } //시퀸스도 컬렉션과 똑같은 API를 제공한다.
        .toList()) // 결과 시퀸스를 다시 리스트로 변환한다.
}