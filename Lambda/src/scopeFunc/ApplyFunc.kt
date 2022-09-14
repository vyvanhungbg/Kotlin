

fun main() {
    val student:Student = Student()

    println(student.toString())  // Student(firstName=, lastName=, address=)

    student.apply {
        firstName = "Vy"
        lastName = "Hung"
        address = "Bắc Giang"
    }

    //val nStudent = Student("Vy", "Hung", )  // Thiếu đối số , do không có contructor phù hợp

    
    val mStudent = Student().apply {
        //this.firstName = "Hung"  // có thể loại bỏ this
        firstName = "Hung"
        
        
    }

    mStudent.let {
        //println(firstName)  // không nhận ra fistName
        println(it.firstName)
    }
    println(mStudent.toString())  // Student(firstName=Vy, lastName=Hung, address=Bắc Giang)



}


