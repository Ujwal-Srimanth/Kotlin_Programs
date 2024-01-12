class Inherit1 {
// by default this class is final so we use open key word
}
fun main(args:Array <String>)
{
   val car = Car("bmw","red",1,4)
    val plane = Plane("boeing","white and blue",4,4)
    car.move()
    car.stop()
    plane.move()
    plane.stop()
}
open class Vehicle(val name:String,val color:String)
{
    open fun move()
    {
        println("$name is moving")
    }
    open fun stop()
    {
        println("$name has stopped")
    }
}
class Car(name:String,color:String,val engines:Int,val doors:Int): Vehicle(name, color)
{

}
class Plane(name:String,color:String,val engines:Int,val doors:Int): Vehicle(name,color)
{
    override fun move() {
        super.move()
        println("the :) is moving")
    }

}