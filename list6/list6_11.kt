package list6

fun sendEmailTo2(email: String) {
    println("String email to $email")
}
class emails(val email: String) {
}

fun getTheBestPersonInTheWorld(): emails? = emails("ex@email.com")

fun main(args: Array<String>){
    val email: String? = "yole@exmple.com"
    email?.let { sendEmailTo2(email) }

    val email2: String? = null
    email2?.let { sendEmailTo2(email2) }
    getTheBestPersonInTheWorld()?.let { sendEmailTo2(it.email) }
}


