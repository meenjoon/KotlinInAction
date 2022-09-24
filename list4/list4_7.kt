package list4


open class RichButton2 : Clickable { // 이 클래스는 열려있으므로, 다른 클래스가 이 클래스를 상속할 수 있다.

    final override fun click() {} // 여기 있는 "final"은 쓸데 없이 붙은 중복이 아니다. "final"이 없는 오버라이드한 메소드나 프로퍼티는 기본적으로 열려있기 때문이다.
}