class OOPSC(val accountName:String) {
    private var balance =0
    var transactions = mutableListOf<Int>()

    fun deposit(amount:Int)
    {
        if(amount > 0)
        {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        }
        else
        {
            println("cannot deposit negative sums")
        }
    }
    fun withdraw(withdrawal:Int)
    {
        if(-withdrawal < 0)
        {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal deposited. Balance is now ${this.balance}")
        }
        else
        {
            println("cannot withdraw negative sums")
        }
    }
    fun calculateBalance():Int
    {
        this.balance = 0
        for(transaction in transactions)
        {
            this.balance += transaction
        }
        return this.balance
    }
}
fun main(args:Array<String>)
{
    val ujwalacc = OOPSC("Ujwal")
    ujwalacc.deposit(1000)
    ujwalacc.withdraw(500)
    ujwalacc.deposit(-20)
    ujwalacc.withdraw(-100)
    val bal = ujwalacc.calculateBalance()
    print(bal)
    
}