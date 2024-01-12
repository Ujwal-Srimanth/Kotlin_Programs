class CollectionOperations {

}
fun main()
{
    val numbers = setOf(1,2,3,4,5)
    println(numbers.map{it*10})

    println(numbers.map{if (it==3) it*100 else it*10})

    val numberMap = mapOf("key 1" to 1,"key 2" to 2,"key 3" to 3,"key 4" to 4)
    println(numberMap.mapKeys { it.key.uppercase() })
    println(numberMap.mapKeys { it.value + it.key.length })
    println(numberMap.mapValues { it.value + it.key.length })

    println(numbers.mapIndexedNotNull{index,value->if(index==0) null else index*value})

    val colors = listOf("red","brown","grey")
    val animals = listOf("fox","bear","wolf")
    println(colors.zip(animals))
    println(colors.zip(animals){color,animal -> "The ${animal.replaceFirstChar {it.uppercase()}} is $color"})

    val numberPairs = listOf("one" to 1,"two" to 2,"three" to 3,"four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())

    val nos = listOf<String>("one","two","three","four")
    println(nos.associateWith { it.length }) // build the calues
    println(nos.associateBy { it.first().uppercase() }) // build the keys
    println(nos.associateBy(keySelector={it.first().uppercase()} , valueTransform={it.length}))

    val numberSets = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
    //println(numberSets[2][2]) this doesnot work with listofsetof

    val arraySets = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
    for (numbers in numberSets)
    {
        for(number in numbers)
        {
            println(number)
        }
    }
    val numbersFlatten = numberSets.flatten()
    println(numbersFlatten[8])




}