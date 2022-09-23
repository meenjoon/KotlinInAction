package list3

import java.net.Inet4Address

class User(val id: Int, val name: String, val address: String)

fun saveUser(user:User){
    if(user.name.isEmpty()) {
        throw IllegalArgumentException(
            "can't save user ${user.id}:empty name")
    }
    if(user.address.isEmpty()){
        throw java.lang.IllegalArgumentException(
            "can't save user ${user.id}:empty address")
        }
    }
fun main(args : Array<String>){
    saveUser(User(1,"",""))
}


