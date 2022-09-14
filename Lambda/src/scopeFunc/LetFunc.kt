
fun main() {
    var student:Student? = null
    student?.let {
        // không thực hiện
        println(it.toString())
    }

    student = Student("Vy", "Hung", "Bắc Giang")
    student?.let {
        //student.firstName = "1"       // co the
        //it.lastName                   // co the
        //this.                         // khong su dung
        println(it.toString())  // Student(firstName=Vy, lastName=Hung, address=Bắc Giang)
    }
}

