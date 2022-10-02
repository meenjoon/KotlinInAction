package list6

class MyService2{
    fun performAction(): String = "foo"
}
class MyTest2 {
    private lateinit var myService2: MyService2 //초기화하지 않고 널이 될 수 없는 프로퍼티를 선언한다.

    @Before fun setUp(){
        myService2 = MyService2() //setUp 메소드에서 프로퍼티를 초기화 한다.
    }
//    @Test fun testAction() {
//        Assert.assertEquals("foo",myService2.performAction())//널 검사를 수행하지 않고 프로퍼티를 사용한다.
//
//    }
}