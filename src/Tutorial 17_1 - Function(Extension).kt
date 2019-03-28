fun main(args: Array<String>) {

    //String Method
    val stringValue1 = "Hello "
    val stringValue2 = "World "
    val stringValue3 = "DevMonkey, "

    println(stringValue3.add(stringValue1,stringValue2))

    //Int Method
    val intValue1 = 2
    val intValue2 = 1

    val validationValue = intValue2.validationValue(intValue1)
    println("${validationValue}")

}

fun String.add(sv1:String, sv2:String) :String{
    return(this + sv1 + sv2)
}

fun Int.validationValue(other:Int):Int{
    return if (this > other){
        this
    }else{
        other
    }
}
