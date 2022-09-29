package list5

import java.io.File

fun main(args: Array<String>){
    var file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
}
fun File.isInsideHiddenDirectory() = generateSequence (this) {it. parentFile}.any{it.isHidden}