fun main(args: Array<String>) {
    var res = volume(12,21)
    println(res)
}

fun volume(length:Int , width:Int, height:Int = 10): Int{
    val result = length * width * height
    return (result)
}