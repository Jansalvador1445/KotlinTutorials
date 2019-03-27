fun main(args:Array<String>) {

    var i:Int = 0

    //While Loop
    println("While Loop")
    while (i < 6){
        println(i)
        i++
    }

    //Do-While Loop
    println("\nDo While Loop")
    i = 5
    do {
        i--
        println("Value of i is ${i}")
    }while (i > 1)

}