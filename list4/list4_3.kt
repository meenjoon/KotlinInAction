package list4

interface Clickable2 {
    fun click() //일반 메소드 선언
    fun showOff() = println("I'm clickable!") //디폴트 구현이 있는 메소드
}