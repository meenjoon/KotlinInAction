package list4

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state: State){}
}