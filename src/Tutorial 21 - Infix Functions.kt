fun main(args: Array<String>) {

    val valueOne = 7
    val valueTwo = 1

    val validValue = valueOne.graterValue(valueTwo)

    println(validValue)

}

infix fun Int.graterValue(i:Int):Int{
    return if (this > i){
                this
            } else{
                i
            }
}