package list6

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() { //Unit을 반환하지만 타입을 지정할 필요는 없다.
        //업무 처리 코드
    } //여기서 return을 명시 할 필요가 없다.
}