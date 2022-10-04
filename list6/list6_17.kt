package list6

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("we're ${percent}% done!")
}

fun main(args: Array<String>){
    showProgress(30)
    showProgress(146)

}