package list4

class User4(val name: String){
    var address: String = "unspecified"
        set(value) {
            println("""
                Adrress was changed for $name:
                "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 값 읽기
                field = value // 뒷받침하는 필드 값 변경하기
        }
}

fun main(args: Array<String>){
    val User = User4("Alice")
    User.address = "Elsenheimerstrasse 47, 80687 Muechen"
    println(User.address)

}