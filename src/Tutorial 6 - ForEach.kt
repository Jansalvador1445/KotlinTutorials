fun main(args:Array<String>) {

    //For Each : (Range).forEach{it:Int}
    //NOTE: Default variable is 'it'
    println("Method #1 ")
    (1..5).forEach {
        println(it)
    }

    //For Each : (Range).forEach{it:Int} - > Change the Variable name
    println("\nMethod #2 ")
    (1..5).forEach {
        x -> println(x)
    }


}