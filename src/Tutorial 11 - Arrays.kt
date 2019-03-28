import java.util.*

fun main(args:Array<String>) {

    // Elements : 10 11 12 13 14 15
    // Indexes :  0 1 2 3 4 5

    //Array Number
    println("Method #1 ")
    var myArray = Array<Int>(5) {0}
    myArray[0] = 10
    myArray[1] = 11
    myArray[2] = 12
    myArray[3] = 13
    myArray[4] = 14

    for(i in 0..myArray.size - 1){
        print("${myArray[i]} ")
    }

    //Simple Array with Input
    println("\nMethod #2")
    var myArray_Input = Array<Int>(5){0}

    with(Scanner(System.`in`)){
        for (i in 0..myArray_Input.size - 1){
            print("Input ${i + 1} :")
            var inputValue = nextInt()
            myArray_Input[i] = inputValue
        }
    }

    for(i in 0..myArray_Input.size - 1){
        print("${myArray_Input[i]} ")
    }


}