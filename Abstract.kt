
abstract class Abstract() {
    abstract fun move()
    abstract fun stop()
    fun run()
    {
        print("hi")
    }
}
class Car1(var name:String,var color:String):Abstract()
{
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}