class oops(name:String,branch:String,roll:Int) {
    var name =name
    var branch=branch
    var roll=roll
    fun prin()
    {
        print("The name is ${name.trim()}\n")
        print("The branch is $branch\n")
        print("The roll is $roll\n")
    }

}
class ini(name:String , var age:Int)
{
    var name:String
    init {
        if(name.lowercase().startsWith('a'))
        {
            this.name = name;
        }
        else
        {
            this.name="User"
            println("hi bb")
        }
    }
}
fun main(args: Array<String>)
{
    var a = oops("     srimu     ","CSEE",40)
    a.prin()
    a.name=" ujwal  "
    a.branch="CSE"
    a.roll = 40
    a.prin()

    var b = ini("Aiii",90)
    var c = ini("ujwal",89)
}