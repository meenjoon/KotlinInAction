package list2

import  list2.Color.*

class list2_16_when {
}

fun mixOptimized(c1 : Color, c2 : Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED) ->
            ORANGE
        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW) ->
            GREEM
        (c1 == BLUE && c2 == VIOLET) ||
                (c1 == VIOLET && c2 == BLUE) ->
            INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main(args:Array<String>){
    println(mixOptimized(RED,YELLOW))
}