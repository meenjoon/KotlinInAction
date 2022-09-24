package list4

abstract class Animated { // 이 클래스는 추상 클래스다. 이 클래스의 인스턴스는 만들 수 없다.
    abstract  fun animate() // 이 함수는 추상 함수다. 이 함수에는 구현이 없다. 한위 클래스에서는 이 함수를 반드시 오버라이드 해야한다.
    open fun stopAnimating() { // 추상 클래스에 속해 있더라도 비추상 함수는 기본적으로 파이널이지만 원한다면 open으로 오버라이드를 허용할 수 있다.
    }
    fun animateTwice(){ // 추상 클래스에 속했더라도 비추상 함수(abstract가 아닌)는 기본적으로 파이널이다.
    }
}
 open class TalkativeButton : Focusable {
     fun yell() = println("Hey!")
     fun whisper() = println("Let's talk!")
}

 fun TalkativeButton.giveSpeech() { // 오류: public 멤버가 자신의 internal 수신타입인 TalkativeButton을 노출함
    yell() // 오류: yell은 TalkativeButton의 private 멤버라서 yell에 접근 할 수 없음
    whisper() // 오류: whisper는 TalkativeButton의 protected 멤버라서 whisper에 접근할 수 없음.
}