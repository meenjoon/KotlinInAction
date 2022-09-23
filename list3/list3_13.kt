package list3

import java.lang.IllegalArgumentException
import java.net.Inet4Address

class User3(val id: Int, val name: String, val address: String)

fun saveUser3(user:User3){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                "can't save user ${user.id}: " +
                        "empth $fieldName"
            )
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")

}
fun main(args : Array<String>){
    saveUser(User(1,"",""))
}


