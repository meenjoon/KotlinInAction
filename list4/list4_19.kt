package list4

import com.google.gson.Gson

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

data class SampleClass(var id: Int, var list: MutableList<Int>, var name: String){
    // fromJson : Json 데이터를 지정한 타입으로 변환
    // toJson : 지정한 타입의 데이터를 Json 형식으로 변환
    //toJson 메서드를 사용해서 data class의 값을 먼저 Json 형식으로 변환하고, fromJson 메서드를 사용해서 해당 데이터를 다시 data class의 형식으로 변환해주면 깊은 복사를 쉽게 할 수 있다.
    fun deepCopy() : SampleClass {
        return Gson().fromJson(Gson().toJson(this), this::class.java)
    }
}

fun main(args: Array<String>){

    val instance1 = SampleClass(1, mutableListOf(1, 2, 3), "빈지노")
    val instance2 = instance1.deepCopy()

    instance1.id = 3
    instance1.list.add(4)
    instance1.name = "창모"

    println(instance2.id) // 깊은 복사라면 1 나와야함
    println(instance2.list) // 깊은 복사라면 [1, 2, 3] 나와야함
    println(instance2.name) // 깊은 복사라면 "빈지노" 나와야함
}