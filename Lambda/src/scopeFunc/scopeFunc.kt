package scopeFunc/*
class Student {
    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var address: String

    override fun toString(): String {
        return "name = $firstName $lastName , address = $address\n"
    }
}

fun main() {
    val student:Student? = null
    student?.let {
        println(student.toString())
    }

    val mStudent = Student("")

}*/
