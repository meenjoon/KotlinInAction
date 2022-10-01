package list5

import javax.naming.Context

fun alphabet4() = StringBuilder().apply {
    for(letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

//fun createViewWithCustomAttributes(context: Context) =
//    TextView(context).apply {
//        text = "Sample Text"
//        textSize = 20.0
//        setPaddomg(10,0,0,0)
//    }