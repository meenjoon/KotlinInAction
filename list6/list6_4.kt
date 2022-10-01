package list6

class Address(val streetAddress: String, val zipCode: Int,
            val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person3(val name: String, val company: Company?)

fun Person3.countryName() : String {
    val country = this.company?.address?.country
    return if (country !=null) country else "Unknown"
}
fun main(args: Array<String>){
    val address = Address("9-12", 1111,"donghae","korean")
    val company = Company("comany",address )
    val person3 = Person3("Alice", company)
    val person32 = Person3("Dmitry", null)

    println(person3.countryName())
    println(person32.countryName())
}