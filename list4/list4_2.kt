package list4

import list3.joinToString2

class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main(args : Array<String>){
    Button().click()
}