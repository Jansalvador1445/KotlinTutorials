fun main(args: Array<String>) {

    //Mutable types of Maps
    val myMap = hashMapOf<Int, String>()
    /**
     * NOTES:
     * You can use this ff:
     *      - HashMap<Int, String>()
     *      - mutableMapOf<Int, String>()
     *      - hashMapOf<Int, String>()
     * **/

    myMap.put(1, "Hello")
    myMap.put(2, "World")
    myMap.put(3, "Kotlin")

    //Method 1 - Fetching Data
    for(i in myMap.keys)
        println(myMap[i])

    //Method 2 - Fetching Data
    for (i in myMap.keys)
        println(myMap.get(i))

}