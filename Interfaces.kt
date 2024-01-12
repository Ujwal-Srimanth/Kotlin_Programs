class Interfaces {

}
fun main(args: Array<String>)
{

}
interface Engine
{
    fun startEngine()
    {
        print("hi")
    }
    fun closeEngine()
}
class Car2(val name:String,val color:String):Engine{
    override fun closeEngine() {
        println("somehting is dome")
    }

}