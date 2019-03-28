
fun main(args: Array<String>) {
    var gradeValue:Int = 86
    var cota = Grades()

    println("Passed: ${cota.isPassed(gradeValue)}")
    println("TES: ${cota.isChed(gradeValue)}")
}


class Grades{
    fun isPassed(grade:Int) :Boolean{
        return (grade > 50)
    }
}

fun Grades.isChed(grade: Int) :Boolean{
    return (grade > 85)
}



