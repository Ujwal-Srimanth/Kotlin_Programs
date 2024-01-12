import kotlin.reflect.typeOf

class StringRepresentation {

}
fun main()
{
    val numberStr = listOf("one","two","three","four")
    println(numberStr.joinToString())
    val listStr = StringBuffer("the list of numbers: ")
    println(numberStr.joinTo(listStr))

    val a = numberStr.joinTo(listStr)
    println("hi")
    println(a)

    println(numberStr.joinToString(separator = " | ",prefix="start: ",postfix = ": end"))

    val numbers = (1 .. 100).toList()
    println(numbers)

    println(numbers.joinToString(limit=25,truncated="<..>"))

    println(numberStr.joinToString { "Element:${it.uppercase()}" })


}
