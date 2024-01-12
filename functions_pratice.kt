
class functions_pratice {

}
fun main(args: Array<String>)
{
    sayHello()
    sayHelloo("Alex",22)
    val max:Int = getMax(5,9)
    print("\n $max")
    val max1:Double = getMax(5.2,9.8)
    print("\n $max1")
    sendMessage("Alexa")
    print(sum(10,20,30,40))
    print(sumw(10,20,30,40))
}
fun sayHello()
{
    print("Hello")
    val hasInternetConnection = true
    if(hasInternetConnection)
    {
        getData("some data")
    }
    else
    {
        show()
    }
}
fun sayHelloo(name: String,age: Int)
{
    //parameters cannot be changed as they are defaulty val
    var number = age
    //now they can be updated , the scope is inside only cannot be used outside
    print("\nHello , $name ! Your age is $age")
}
fun getData(data:String)
{
    print("Your data is: $data")
}
fun show()
{
    print("there is no internet connection")
}
fun getMax(a:Int,b:Int):Int
{
    val max = if(a>b) a else b
    // return if(a>b) a else b
    // fun getMax(a:Int,b:Int):Int = if(a>b) a else b
    return max
}
fun getMax(a:Double,b:Double):Double
{
    return if(a>b) a else b
}
//function overloading can be done by either change in number of parameters or tye of parmeters
fun sendMessage(name: String,message:String="")
{
    print("Name = $name and message = $message")
    // so here we can pass the message
    // if we donot pass the message then we need pass a default paramter
}
fun sum(vararg numbers:Int):Int
{
    var result=0
    for(number in numbers)
    {
        result+=number
    }
    return result
}
fun sumw(vararg numbers:Int)
{
    numbers.forEach {println(it)}
}




