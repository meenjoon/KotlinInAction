package list2.shapes // 패키지 선언

import java.lang.Math.random // 표준 자바 라이브러리 클래스를 임포트

class Rectangle(var height: Int, val width: Int){ //패키지 선언
    var isSquare:Boolean
        get() = height == width
        set(value) {

        }

    var num:Int
        get() = height
        set(value) {}
}
fun createRandomRectangle() : Rectangle {
    val random = random();
    return Rectangle(random.toInt(),random.toInt())
}

//fun list2.main(args:Array<String>) {
//    val Rectangle = Rectangle(11.2,11.2)
//    println(Rectangle.isSquare)
//    println(Rectangle.num)
////    println(3.also { Rectangle.height = it })
////    println(Rectangle.height)
//}