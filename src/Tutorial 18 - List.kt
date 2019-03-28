fun main(args: Array<String>) {

    var list = ArrayList<String>()

    //Add value in ArrayList
    list.add("Hello")
    list.add("World")
    list.add("DevMonkey")

    //Print all the value of ArrayList
    for (i in list)
        println(i)


    //Remove value in ArrayList
    list.remove("World")

    //Print all the value of ArrayList
    for (i in list)
        println(i)

}