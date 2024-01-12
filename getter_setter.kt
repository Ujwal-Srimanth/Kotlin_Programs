class getter_setter(firstName:String , var lastName:String="LastName",var age:Int=0) {

    lateinit var fav:String;
    var firstName = firstName
        get()
        {
            return "FirstName:$field"
            //whenever firstname is printed getter is called
        }
        set(value)
        {
            //can write some loic here also
            //whenever there is a name assigned setter is called
            print("the first name assigned to the value is $value" )
            field=value
            //if firstName=value in the setter it calls a recursive call and always there is a infinite loop running
        }
//    fun setFirstName(newValue:String)
//    {
//        this.firstName = newValue
//    }
//    fun getFirstName():String
//    {
//        return this.firstName
//    }
    // get()=field
    //set(value) {field=value}
}
fun main(args:Array<String>)
{
    val user = getter_setter("Alex")
    user.firstName = "hi"
    print("\n")
    println(user.firstName)
    user.fav="interstellar"
    //something if we want to initialize later



    //default values cannot be used with secondary constructors
}