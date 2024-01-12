class ObjectExp {
}
fun main(args: Array<String>)
{
    val loginButton = Button1("Login",1232,object:OnClickListener
    {
        override fun onClick() {

        }

    })
}
class Button1(val text:String,val id:Int,onClickListner: OnClickListener)
interface OnClickListener
{
    fun onClick()
}