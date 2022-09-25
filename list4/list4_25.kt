package list4

class User5 {
    val nickname: String
    constructor(emial: String){
        nickname = emial.substringBefore('@')
    }
//    constructor(facebookAccountId: Int) {
////        nickname = getFacebookName(facebookAccountId)
//    }
}