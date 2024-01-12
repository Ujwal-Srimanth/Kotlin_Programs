class LazyInit(var firstName:String,var lastName:String,var age:Int) {
    init
    {
        println("User: $firstName was created")
    }
}
fun main(args: Array<String>)
{
    val user1 = LazyInit("Alex","Dobbin",23)
    // lazy intialization :- object is not initialized when it is created rather when it is used it is initlaized
    val user2:LazyInit by lazy{
        LazyInit("User1","lastName",0)
    }
    //println(user2.firstName)
}

