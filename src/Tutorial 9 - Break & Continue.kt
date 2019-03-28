fun main(args:Array<String>) {

    //Break
    println("Break")
    for (i in 1..5){
        print(" ${i} ")

        if(i == 3){
            print("Break here . . . ")
            break
        }
    }

    //Continue
    println("\nContinue")
    for (i in 1..5){
        print(" ${i} ")

        if(i == 3){
            print("Continue here . . . ")
            continue
        }
    }
}