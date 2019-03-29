fun main(args: Array<String>) {

    val personOne = PersonDetails("DevMonkey",21)
    val personTwo = PersonDetails("DevJoseph",21)

    println(personOne.toString())

    val resValidation = if (personOne == personTwo) print("Person one & two are the same") else println("Let's Proceed")
    println(resValidation)

    val newPerson = personOne.copy(id = 45)
    println(newPerson)
}

data class PersonDetails(var name:String, var id:Int)