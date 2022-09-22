package list2

import  list2.Color.*

class list2_15_when {
}

fun mix(c1 : Color, c2 : Color) =
    when (setOf(c1, c2)){ // when 식의 인자로 아무 객체나 사용할 수 있다. when은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트한다.
        setOf(RED,YELLOW) -> ORANGE // 두 색을 혼합해서 다른 색을 만들 수 있는 경우를 열거한다.
        setOf(YELLOW,BLUE) -> GREEM
        setOf(BLUE,VIOLET) -> INDIGO

        else -> throw Exception("Dirty color") // 매치되는 분기 조건이 없으면 이 문장을 실행한다.
    }

fun main(args:Array<String>){
    println(mix(RED,YELLOW))
}