fun main(args: Array<String>) {
    var expValue = max(10,11)
    println("The greater number is $expValue")
}

fun max(a: Int, b: Int): Int =
    if (a > b) {
        println("$a is Greater that $b")
        a
    }else{
        println("$b is Greater that $a")
        b
    }


