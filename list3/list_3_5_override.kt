package list3

open class View{
    open fun click() = println("View clicked")
}

class  Button: View() { //Button은 View를 확장한다.
    override fun click() = println("Button clicked")
}
fun main(args : Array<String>){
    val  view: View = Button() // "view"에 저장된 값의 실제 타입에 따라 호출할 메서드가 결정된다.
    view.click()
}