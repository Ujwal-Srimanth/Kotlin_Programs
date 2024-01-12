class Calculator() {
    //static variables
    companion object {
        var max:Int=100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}
fun main(args: Array<String>)
{
    //like a static variable
    val aa = Calculator.max
    print("\n$aa")
    val a = Calculator.sum(5,10)
    print("\n$a")
}
