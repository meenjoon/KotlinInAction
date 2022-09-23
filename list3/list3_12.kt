package list3

import java.lang.IllegalArgumentException
import java.net.Inet4Address

class User2(val id: Int, val name: String, val address: String)

fun saveUser2(user:User2){
    fun validate(user: User2, value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException(
                "can't save user ${user.id}:empty name")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

}
fun main(args : Array<String>){
    saveUser(User(1,"",""))
}


