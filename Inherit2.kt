import java.awt.ComponentOrientation

class Inherit2 {

}
open class View()
{
    open fun draw()
    {
        println("Drawing the view.")
    }
}
open class Button(val text:String,val orientation: String):View()
{
    override fun draw() {
        println("drawing the button")
        super.draw()
    }
}
class RoundButton(text: String,orientation: String,val corners:Int):Button(text,orientation)
{
    override fun draw()
    {
        println("Drawing the round button")
    }
}
fun main(args: Array<String>)
{
    val view = View()
    val button = Button("Login","Center")
    val roundButton = RoundButton("Sing Up","Center",30)
    view.draw()
    button.draw()
    roundButton.draw()
}