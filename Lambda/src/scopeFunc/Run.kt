package scopeFunc/*
import java.util.*

data class Student(var firstName: String, var lastName: String, var age: Int) {
    constructor():this("", "", 0)

    fun calcYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

fun main() {
    val student:Student? = Student()

    with(student){
        student?.age =1         // phải gọi student tham chiếu
        println(toString())  // Student(firstName=, lastName=, age=1)
    }

    var mAge  = student?.let {
        it.age = 21
        it.calcYearOfBirth()  // với let phải sử dụng cả it dài dòng
    }

    println(mAge) //2001

    var mAge2 = student?.run {
        firstName = "Vy"
        age = 21
        calcYearOfBirth()   // kết hợp let và with vừa khởi tạo và thực hiện lệnh
    }
    println(mAge2) //2001

    // run sử dụng dưới dạng không phải extension
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"
        Regex("[$sign]?[$digits$hexDigits]+")
    }



    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }
}

*/
