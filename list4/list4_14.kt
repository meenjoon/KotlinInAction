package list4

interface User2 {
    val nickname: String
}

class  PrivateUser(override val nickname: String ) :User2 //주 생성자에 있는 프로퍼티

class SubscribingUser(val email: String) : User2 {
    override val nickname: String
        get() = email.substringBefore('@') //커스텀 게터
}
//class FacebookUser(val accountId: Int) : User2 {
//    override val nickname = getFacebookName(accountId)
//}


interface User3 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@') //프로퍼티에 뒷받침하는 필드가 없다. 대신 매번 결과를 계산해 돌려준다.
}

class qq(override val email: String) : User3 {

}

fun main(args: Array<String>){
    println(PrivateUser("test@kotlinlang.ort").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

    val gg = qq("sfs@aaa.com")
    println(gg.nickname)
}