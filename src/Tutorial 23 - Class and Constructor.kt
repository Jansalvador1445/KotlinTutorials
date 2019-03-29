fun main(args: Array<String>) {

    var details = Peeps("DevMonkey",156)
    println(details.id)
}

class Peeps(name:String){
    var id:Int = -1

    init {
        println("Name of the Student : ${name} and his/her Student No. ${id}")
    }

    //This is a Init Block
    constructor(name: String, id: Int): this(name){
        this.id = id
    }

}