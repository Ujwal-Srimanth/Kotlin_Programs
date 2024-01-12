data class DataClass(var firstName:String,var lastName:String) {
    var age=0
//    override fun equals(other: Any?): Boolean{
//        if(this === other)
//        {
//            return true
//        }
//        if(other is DataClass)
//        {
//            return this.firstName == other.firstName && this.lastName==other.lastName && this.age == other.age
//        }
//        return false
//    }
//
//    override fun toString(): String {
//        return "User(firstName=$firstName,lastname=$lastName age=$age"
//    }

}
fun main(args:Array<String>)
{
    val user1 = DataClass("Alex","Dobbin")
    val user2 = DataClass("Alex","Dobbin")
    print(user1.equals(user2))
    //so this calls the equals method in any class
    //which just checks whether the objects are same
    //but these are 2 different objects so we
    //override the any class
    print(user1)
    print(user2)
    //print calls toString function in any class

    //if we dont want to write all the impplementations just keep data keyword

}