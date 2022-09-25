package list4

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

//window.addMouseListener (
//    object : MouseAdapter() { //MouseAdapter를 확장하는 무명 객체를 선언한다.
//        override fun mouseClicked(e: MouseEvent?) { //MouseAdapter의 메서드를 오버라이드 한다.
//            super.mouseClicked(e)
//        }
//
//        override fun mouseEntered(e: MouseEvent?) { //MouseAdapter의 메서드를 오버라이드 한다.
//            super.mouseEntered(e)
//        }
//    }
//
//)

val listener = object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }

    override fun mouseEntered(e: MouseEvent?) {
        super.mouseEntered(e)
    }
}
