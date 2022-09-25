package list4

class Client2(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalcode=$postalCode)"
}
fun main(args: Array<String>){
    val client = Client2("오현석", 4122)
    val client2 = Client2("오현석", 4122)
    println(client)
}