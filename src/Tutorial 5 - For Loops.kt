fun main(args:Array<String>) {

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("Method #1 : 1 - 5")
    for (i in 1..5){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #2: 5 - 1")
    for (i in 5 downTo 1){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #3: 1 3 5")
    for (i in 1..5 step 2){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #4: 5 3 1")
    for (i in 5 downTo 1 step 2){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #5: a - c")
    for (i in 'a'..'c'){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #5: c - a")
    for (i in 'c' downTo 'a'){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #6: a c e")
    for (i in 'a' .. 'f' step 2){
        println("${i}")
    }

    //For Loops using the ranges (Tutorial 3 - Ranges.kt)
    println("\nMethod #7: f d b")
    for (i in 'f' downTo 'a' step 2){
        println("${i}")
    }

    //For loop - Until
    //Output: 1 2 3 4
    println("\nMethod #8: Until")
    for (i in 1 until 5){
        println("${i}")
    }


}