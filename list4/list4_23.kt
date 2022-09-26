package list4

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path,ignoreCase = true)
    }
}
data class Filess(val name:String) {

    //중첩으로 사용 가능
    companion object FileComparator {
        val s = 5
        }
    object dd {
        val c = 5
    }
}
fun list4.Filess.FileComparator.fromJSon(){
    val ff = 3
    println(ff)

}
fun list4.Filess.fromJSon(){
    val ff = 3
    println(ff)

}

object SingletonClass {
    val sampleString = "Sample String"
}

fun main(args: Array<String>){

    val qwe = Filess("asd")
    val qwe2 = Filess("asd")
    Filess.FileComparator.fromJSon()
    Filess.fromJSon()


    val files = listOf(File("/z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
    println(CaseInsensitiveFileComparator.compare(File("/User"),File("/user")))

    println(SingletonClass.sampleString)
}