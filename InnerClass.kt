class InnerClass(val items: Array<String>) {

    inner class IC()
    {
        fun display(position: Int)
        {
            println(items[position])
        }
    }

}
fun main(args: Array<String>)
{
    val listView = InnerClass(arrayOf("Name1","Name2","Name3","Name4"))
    listView.IC().display(2)

}