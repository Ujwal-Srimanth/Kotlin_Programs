class Variables {

}

fun main()
{
    var userName: String = "Ujwal"
    val user: String="Ujwal" 
    //user = "esejksvns" it cannot be redefined
    var age:Int = 32
    val maxValue:Int = Int.MAX_VALUE
    val minValue:Int = Int.MIN_VALUE
    print("Hello $userName your age is $age\n");
    print("The max value of the integer is $maxValue and the min value of the integer is $minValue")

    val maxByte:Byte = Byte.MAX_VALUE
    val minByte:Byte = Byte.MIN_VALUE
    print("the max value of byte is $maxByte and minvalue is $minByte")

    val myNumber1 = 28L  //this means this is a Long number

    val myNumber = 2.5f //cant keep myNumber:Float
    val mySecondNumber:Double = 2.5 //no 2.5d for double
    print("\nmyNumber $myNumber mySecondNumber $mySecondNumber\n")

    val myCharValue:Char = 'D'
    print("$myCharValue")
    val myBooleanValue:Boolean = false
    print(myBooleanValue)

    var x=10
    var y = 20
    val result = x+y
    print("result = $result")

    var x1="a"
    var y1="2"
    val res:String = x1+y1
    print("\nres = $res")

    var x2='a'
    var y2='2'
    val res1 = x2+y
    print("\nres = $res1")
    print("x+y = ${x2+23}")

     var a=5
    var b:Double = 3.0
    val c = a/b
    print(c)

    //x++ & ++x will work
    val isActive = false
    if(isActive){
        print("\nthe user is active")
    }
    else if(a==5)
    {
        print("\nhi i am ujwal")
    }
    //    or - ||

    val num1 = -5
    val num2 = -3
    val text = if(num1 > 0 || num2>0){
        "This is text1"
    }
    else
    {
        "This is text 2"
    }
    print("$text")

    val text1 = if(num1>0||num2>0) "This is text 1" else 5
    print("$text1")


    //WHEN
    val alarm = 4
    when(alarm) {
        12 -> print("the time is $alarm")
        7 -> print("the time is $alarm")
        14,17,8 -> {
            print("the time is $alarm")
            print("HI")
        }
        in 1..5 ->  print("the time is $alarm")
        else -> print("the time is $alarm")
    }


    val uiop = when(alarm) {
        12 -> 5
        7 -> "the time is"
        14,17,8 -> {
            "HI"
        }
        in 1..5 ->  "hbh"
        else -> 77
    }
    print("\n$uiop")

    val tt:String? = null
    print("tt\n")
    print(tt?.length)
    print("tt\n")
    //print(tt!!.length) // throws an exception

    val tt1:String ="uuuu"
    if (tt1 != null)
    {
        print("\n")
        print(text.length)
    }

    var text3:String = tt ?: "The variable is null"
    print("\n$text3")
}

