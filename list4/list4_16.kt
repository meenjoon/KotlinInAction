package list4

class LengthCounter{
    var counter: Int = 0
          private set // 이 클래스 밖에 이 프로퍼티의 값을 바꿀 수 없다.
    fun addWord(word: String){
        counter += word.length
    }
    fun main(args: Array<String>){
        val leng = LengthCounter()
        leng.counter = 1 //  leng.counter의 set(세터)는 private로 선언되었지만 LengthCounter 클래스 내부에 있기 때문에 컴파일 오류가 나지 않는다.
        println(leng.counter)
    }
}
fun main(args: Array<String>){
    val leng = LengthCounter()
//    leng.counter = 1 // leng.counter의 set(세터)는 private로 선언되었기 때문에 LengthCounter클래스 내에서만 사용 가능하다. 여기는 LengthCounter의 밖의 main문이라 컴파일 오류가 뜬다.
}