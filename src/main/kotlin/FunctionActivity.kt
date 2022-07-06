fun main() {

    // method 1 for checking is the familyName null or no. -==>
//    if (familyName != null) {
//        println(familyName.toInt())
//    }

    // kotlin method 2: -==>
//    familyName?.toInt() // check if not null run the code!
//    familyName?.toInt() ?:"20"
//    familyName!!.toInt() // anyway, run it!

    // kotlin method 3: -==>
//    familyName?.let {
//        it.toInt()
//    }

    // kotlin method 4: lateinit -==>

    lateinit var name:String

    name= "Mohammadreza Fekri"

    println(name)

//    var id: Int? = null // for the numbers from primitive types you should use it


}