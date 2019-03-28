fun main(args: Array<String>) {

    //Mutable Set
    val hashSet = mutableSetOf<Int>( 2, 3, 3, 1, 4, 5, 5, 8, 9)
    //var hashSet = hashSetOf<Int>( 2, 3, 3, 1, 4, 5, 5, 8, 9)  //You can use this too.

    //Removes all the value from the hashSet
    hashSet.remove(5)

    //Add value to the hashSet
    hashSet.add(55)

    //Prints the value from the hashSet but will print once(if there is duplication of value)
    for(i in hashSet)
        println(i)

}
