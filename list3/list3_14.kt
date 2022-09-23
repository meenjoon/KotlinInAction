package list3

import java.lang.IllegalArgumentException

class User4(val id: Int, val name: String, val address: String)

fun User4.validateBeforeSave() {
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                "can't save user ${id}: " +
                        "empth $fieldName"
            )
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}
fun saveUser4(user: User4){
    user.validateBeforeSave()
}




fun main(args : Array<String>){
    val kotlinLogo = """| // .|// .|/ \"""
//    saveUser4(User4(1,"ss","aa"))
    println(kotlinLogo.trimMargin("."))
}


