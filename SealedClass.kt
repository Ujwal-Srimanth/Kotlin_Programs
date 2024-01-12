class SealedClass {

}
fun main(args: Array<String>)
{
  val success = Result.Success("Succes",20)
    val error = Result.Error("noo",211)
    getData(error)
}
fun getData(result: Result)
{
    when(result)
    {
        is Result.Error -> result.showMessageforsuccess()
        is Result.Success -> result.showMessageforsuccess()
    }
}
sealed class Result(val message: String,val score:Int)
{
    fun showMessageforsuccess()
    {
        println("Result: $message , score is $score")
    }
    class Success(message: String,score: Int):Result(message,score)
    class Error(message: String,score:Int):Result(message,score)
}