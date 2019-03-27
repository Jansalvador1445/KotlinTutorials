import org.w3c.dom.ranges.Range
import java.awt.font.NumericShaper

fun main(args:Array<String>) {

    //Range from minimum value to maximum value.
    // Expected Output: 1 2 3
    var min_max = 1..3

    //Range from maximum value to minimum value.
    // Expected Output: 3 2 1
    var max_min = 3 downTo 1

    //Range from minimum value to maximum value but skip by a value.
    // Expected Output: 5 3 1
    var min_max_skip = 5 downTo 1 step 2

    //Range from maximum value to minimum value but skip by a value.
    // Expected Output: 1 3 5
    var max_min_skip = 1 .. 5 step 2

    //Range from a to z (depends on the start value and end value).
    // Expected Output: a b c
    var a_z = 'a'..'c'

    //Range from a to z (depends on the start value and end value).
    // Expected Output: c b a
    var z_a = 'c' downTo 'a'

    //Count down from minimum value to maximum value.
    // Expected Output: 1 2 3 4 5
    var cd_min_max = 1.rangeTo(5)

    //Count down from minimum value to maximum value.
    // Expected Output: 1 2 3 4 5
    var cd_max_min = 5.downTo(1)

    //Count down from a to z (depends on the start value and end value).
    // Expected Output: a b c
    var cd_a_z = 'a'.rangeTo('c')

    //Count down from a to z (depends on the start value and end value).
    // Expected Output: c b a
    var cd_z_a = 'c'.downTo('a')


    //Method 1
    println("Method #1")
    val methodValue = 5

    if (methodValue !in 10..1){
        print("${methodValue} = exist in ranges")
    }else{
        print("${methodValue} = Sorry, doesn't exist")
    }

}