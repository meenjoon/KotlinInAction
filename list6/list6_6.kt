package list6

class Address2(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
class Company2(val name: String, val address: Address2?)
class Person2(val name: String, val company: Company2?)

fun printShippingLabel(person:Person2){
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address") //주소가 없으면 예외를 발생시킨다.
    with(address) {//adress는 널이 아니다.
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}
fun main(args: Array<String>){
    val address = Address2("9-12", 1111,"donghae","korean")
    val company = Company2("comany",address )

    val person = Person2("Alice", company)
    val person2 = Person2("Dmitry", null)

    println(printShippingLabel(person))
    println(printShippingLabel(person2))
}