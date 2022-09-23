package list3

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args : Array<String>){
    val view: Button = Button()
    view.showOff()
}