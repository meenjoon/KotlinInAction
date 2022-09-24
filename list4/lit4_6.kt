package list4

open class RichButton : Clickable { // 이 클래스는 열려있으므로, 다른 클래스가 이 클래스를 상속할 수 있다.
    fun disable() {} // 이 함수는 파이널이므로 하위 클래스가 이 메서드를 오버라이드 할 수 없다.
    open fun animate() {} // 이 함수는 열려 있으므로 하위 클래스에서 이 메서드를 오버라이드 해도 된다.
    override fun click() {} // 이 함수는 (상위 클래스에서 선언된) 열려있는 메서드를 오버라이드 한다. 오버라이드한 메서드는 기본적으로 열려잇다.(open)
}