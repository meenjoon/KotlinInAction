package list4

interface ButtonClickListener {
    fun onButtonCLicked()
}

//object : ButtonClickListener {
//    override fun onButtonCLicked() {
//        TODO("Not yet implemented")
//    }
//}
class Button5(private val buttonClickListener: ButtonClickListener) {
    fun buttonClickCallback() {
        buttonClickListener.onButtonCLicked()
    }
}
interface sese {
    fun aaa() {

    }
}

fun main(args: Array<String>){
    val buttonclick = object : ButtonClickListener, sese {
        override fun onButtonCLicked() {
            println("무명 객체로 만들었습니다.(무명객체를 변수에 넣음)")
        }

        override fun aaa() {
            super.aaa()
        }
    }


    Button5(object : ButtonClickListener { // 이것은 직접 무명 객체를 생성해 매겨변수에 이용
        override fun onButtonCLicked() {
            println("무명 객체로 만들었습니다.(무명객체 직접 넣음)")
        }
    }).buttonClickCallback()

    Button5(buttonclick).buttonClickCallback() //이것은 무명 객체를 변수에 집어넣고 그것을 매개변수에 이용
}

