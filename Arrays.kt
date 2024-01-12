class Arrays {
}
fun main(args:Array<String>)
{
    val names: Array<String> = arrayOf("John","Steven","Major")
    print(names)
    print("\n$names[0]")
    print("\n${names[0]}")
    print("\n${names.size}")
    for(i in names)
    {
        print("\n${i}")
        if(i is String)
        {
            print("AMMI")
        }
    }
    val numbers = arrayOf("a","b","c",1,2,3,4)
    if(2 in numbers)
    {
        print("\n")
        print(numbers[0])
    }
    val a = findMin(arrayOf(1,2,-3,4,5))
    print("\n$a")
}
fun findMin(numbers: Array<Int>):Int
{
    var a = numbers[0]
    for(i in 1 until numbers.size)
    {
        if (numbers[i]<a)
        {
            a = numbers[i]
        }
    }
    return a
}