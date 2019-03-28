import java.util.*

fun main(args:Array<String>) {
    with(Scanner(System.`in`)){
        print("First Value: ")
        val firstValue = nextInt()

        print("Second Value: ")
        val secondValue = nextInt()

        println("The sum of First value and Second value is ${firstValue + secondValue}.")

    }
}