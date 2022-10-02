package list6

class MyService {
    fun performAction(): String = "foo"
}
class MyTest{
    private var myService: MyService? = null //null로 초기화하기 위해서 널이 될 수 있는 타입(?)인 프로퍼티를 선언했다.
    @Before fun SetUp() {
        myService = MyService() //setUp 메소드 안에서 진짜 초깃값을 지정한다.
    }
//    @Test fun testAction() {
//        Assert.assertEquals("foo",
//        myService!!.performAction()) //반드시 널 가능성에 신경써야하므로 !!나 ?을 꼭 써야 한다.
//    }
}
annotation class Before

