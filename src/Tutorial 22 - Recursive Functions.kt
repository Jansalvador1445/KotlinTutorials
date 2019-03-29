import java.math.BigInteger

fun main(args: Array<String>) {
    //Tailrec -> Prevents Exception
    println(getFibNum(1000,BigInteger("0"),BigInteger("1")))
}

tailrec fun getFibNum(i:Int,x:BigInteger,y:BigInteger) :BigInteger{
    return if (i == 0){
                y
            }else{
                getFibNum(i-1,x+y , x)
            }
}