package list2

import  list2.Color // 다른 패키지에서 정의한 Color 클래스를 임포트한다. [ 현재는 같은 패키지에 있기 때문에 안써도 무방 ]
import  list2.Color.* //짧은 이름으로 사용하기 위해 enum 상수를 모두 임포트 한다.

class list2_14 {
}
fun getWarmth2(color: Color) =
    when (color){
        RED, ORANGE, YELLOW -> ORANGE
        GREEM -> "netural"
        BLUE,INDIGO,VIOLET->"cold"
    }

fun main(args:Array<String>){
    println(getWarmth2(BLUE))
}