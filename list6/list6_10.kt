package list6

fun sendEmailTo(email: String) = email

fun main(args: Array<String>){
    val email: String? = "secret"
    email?.let { email -> sendEmailTo(email) }

}