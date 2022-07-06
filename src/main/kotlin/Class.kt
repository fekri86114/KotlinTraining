open class Human(
    protected val name: String,
    protected val familyName: String,
    protected val mobileNumber: String
) { // this is the primaryConstructor. it's the main constructor
// if i add 'val' to constructor it says oh, yes! they are member of my properties!! it's like you make them at static part

    fun introduce() {
        println("I'm $name $familyName and my phone number is: $mobileNumber.")
    }
}

class Student(
    private val studentId: Int,
    private val entryNumber: Int,
    private val passedCourses: Int,
    private val universityName: String,
    private val universityRank: String,
    private val entryData: Int,
    name: String,
    familyName: String,
    mobileNumber: String

) : Human(name, familyName, mobileNumber) {

    fun introduceStudent() {

        println("My name is $name $familyName")
        println("My phone number is $mobileNumber")
        println("My University is $universityName and rank is $universityRank")
        println("I'm entry at $entryNumber, and my Id is $studentId")
        println("I passed $passedCourses courses in $entryData")

    }
    fun test() {

    }


}

fun main() {

    val mohamad = Student(
        1386, 1404,
        20, "Sharif",
        "2", 1404,
        "mohamad", "alaei",
        "09147031237"
    )

    mohamad.introduceStudent()
}

// for saving our data we have to use visibility modifier : public - private - internal - protected
/*
public : show to all
private : nobody can see / only show to members of tht class
internal : only show to this module / it amke module
protected : only show to the members of this class and members of child classes
*/

/*
this ia a way to define constructor
class Human {
     constructor( name: String, familyName: String, mobileNumber: String )
}
 */

//    init { // example for 'this'
//        this.name = name
//    }

//    constructor(
//        humanName: String,
//        humanFamily: String,
//        mobileHuman: String
//    ) : this() { // you can define constructor with this method.
//
//        name = humanName
//        familyName = humanFamily
//        mobileNumber = mobileHuman
//
//    }
//
//    constructor(humanName: String, humanFamily: String) : this() {
//
//        name = humanName
//        familyName = humanFamily
//        mobileNumber = "no-phone-number"
//
//    }

// there are many methods like 'println(), equals(), ...' you didn't create them. they are coming from Any class. you can call one of them and see ;-)(-;