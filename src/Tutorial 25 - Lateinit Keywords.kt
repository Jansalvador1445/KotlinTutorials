
fun main(args: Array<String>) {
    val country = Country()
    country.setup()
}

class Country {
    /***
     * Lateinit
     *  - Mutable Data type (var)
     *  - Non nullable
     * **/

    lateinit var countryName: String
    fun setup() {
        countryName = "Philippines"
        println("My country name is  $countryName")
    }
}

