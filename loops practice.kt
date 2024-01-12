class `loops practice` {
}
fun main(args:Array<String>)
{
    for(i in 1..10)
    {
        print(i)
    }
    for(i in 1 until 10 ){
        println(i)
    }
    // it can only count upwards above code
    for( i in 10 downTo 1)
    {
        println(i)
    }
    for( i in 1 until 10 step 2)
    {
        println(i)
    }
    for(i in 1..10)
    {
        println(i)
    }

    var number = 0
    while(number<10)
    {
        print("$number")
        number++
    }
    do {
        print("\n$number")
    }while(number<-1)
    number = 0
    while(number<10)
    {
        print("\n")
        number++
        if(number in 1..7)
        {
            continue
        }
        print("$number")

    }
    number = 0
    while(number<10)
    {
        print("\n")
        number++
        if(number==7)
        {
            break
        }
        print("$number")

    }

}