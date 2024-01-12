import kotlin.jvm.internal.PropertyReference0Impl

class Collections {

}
fun main(args:Array<String>)
{
    val names = listOf<String>("Name 1","Name2","Name2")
    println(names[0])
    // above is immutable

    val names1 = mutableListOf("U","J","W","A","L")
    names1.add("N")
    names1.forEach{ println(it) }
    names1.remove("w")
    names1.forEach{ println(it) }
    for (i in names1)
    {
        println("hi")
        println(i)
    }
    println("Set")
    val set = mutableSetOf<String>("Name1","Name2","Name1")
    set.forEach{println(it)}
    set.add("Name3")
    set.forEach{println(it)}

    val set1 = setOf("uhw","inowfa")
    //immutable set

    val user1 = User("name1")
    val user2 = User("name2")
    val user3 = User("name3")
    val user4 = User("name4")
    val user5 = User("name5")
    val user6 = User("Ujwal")
    val user7 = User("Ujwal")

    val objset = mutableSetOf<User>(user1,user2,user3,user4,user4,user5,user5,user6,user7)
    objset.forEach{println(it.name)}
    // it treates both ujwals as same so we need to use data class for it

    val users = mutableMapOf<Int,String>(1 to "Maria",2 to "Alex",3 to "John")
    users[5]="vlad"
    users.remove(2)
    println(users[1])
    users.forEach {
        t,u -> println("$t  and  $u")
    }
}
data class User(val name:String)