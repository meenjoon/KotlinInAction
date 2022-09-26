package list4

interface ButtonClickListener {
    fun onButtonCLicked()
}

object button: ButtonClickListener {
    override fun onButtonCLicked() {
        println("Ok clicekd")
    }
}

fun main(args: Array<String> ) {
    button.onButtonCLicked()
}
