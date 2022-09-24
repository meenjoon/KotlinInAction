package list4

class Button3 : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {/*...*/ } // 이 클래스는 자바의 static nested 클래스와 대응한다.

}