fun main(args:Array<String>) {

    //Repeat
    println("Repeat Method")
    repeat(2){
        print("Hello  ")
    }

    //When
    println("\nWhen Expression")
    var value = 5
    when (value){
        1 -> println("value is ${value}")
        3 -> println("value is ${value}")
        5 -> println("value is ${value}")
        else -> {
            println("No Value of ${value} - Detected")
        }
    }


}