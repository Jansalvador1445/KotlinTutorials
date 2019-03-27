fun main(args:Array<String>) {
    var min = 1
    var max = 10


    //Method #1
    println("Method #1")
    if(min > max){
        println("${min} is greater than ${max}\n")
    }else{
        println("${max} is greater than ${max}\n")
    }

    //Method 2
    println("Method #2")
    val result = if (min > max) print("${min} is greater than ${max}") else  print("${max} is greater than ${max}\n")
    print(result)
}