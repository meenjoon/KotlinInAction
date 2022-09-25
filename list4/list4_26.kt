package list4

class User6 private constructor(val nickname: String) { //주 생성자를 비공개로 만든다,
    companion object { // 동반 객체를 선언한다.
        fun newSubscribingUser(email: String) = User6(email.substringBefore('@'))
//        fun newFacebookUser(accountId: Int) = User6(getFacebookName(accountId))
    }
}
fun main(args: Array<String>){
    val subscribingUser = User6.newSubscribingUser("bob@gmail.com")
//    val facebookUser = User6.newFacebookUser(4)
    println(subscribingUser.nickname)

}