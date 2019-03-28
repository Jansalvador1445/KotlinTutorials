fun main(args:Array<String>) {
    var callingObject = callObj()
    callingObject.stringValue = "Hello World"

    print("${callingObject.stringValue}")
}

class callObj(){
    var stringValue:String = ""
}