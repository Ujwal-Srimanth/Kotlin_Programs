class Singelton private constructor(){
    companion object
    {
        private var instance: Singelton ?= null
        fun getInstance():Singelton?
        {
            if(instance==null)
            {
                instance = Singelton()
            }
            return instance
        }
    }
}
fun main(args: Array<String>)
{
    val instance:Singelton? = Singelton.getInstance()
    val instance2:Singelton? = Singelton.getInstance()
    print(instance)
    print(instance2)
    //as we can see the same  object is created a different object is not created as the construction is private


}