enum class ENUM(var direction:String,var distance:Int) {
    North("north",10),
    South("south",20),
    East("east",15),
    West("west",40)
}

fun main(args: Array<String>)
{
   for(i in ENUM.values())
   {
       println(i.distance)
       println(i.direction)
   }
}