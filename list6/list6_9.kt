package list6

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

class CopyRowAction(val list: JList<String>) : AbstractAction( ){
    override fun isEnabled(): Boolean =
        list.selectedValue != null

    override fun actionPerformed(e: ActionEvent?) { //actionPerformed는 isEnabled가 "ture"인 경우에만 호출된다.
        val value = list.selectedValue!! //value를 클립보드로 복사
    }

}
