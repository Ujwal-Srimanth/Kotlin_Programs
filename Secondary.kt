class Secondary(var name:String,var lastName:String,var age: Int) {
    constructor(name:String): this(name, "LastName",0)
    constructor(name:String,lastName:String):this(name,lastName,0)
}
fun main(args: Array<String>)
{
    val user = Secondary("Alex")
    val friend = Secondary("John","smith")
    println("Name = ${user.name}")
    println("lastName = ${friend.lastName}")

}