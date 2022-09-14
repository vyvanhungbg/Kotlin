package scopeFunc/*
data class Student(var firstName: String, var lastName: String,var address: String) {
    constructor():this("", "", "")
}

fun main() {
    val students = mutableListOf(
        Student("Nguyen", "A", "HN"),
        Student("Hoang", "B", "HP"),
        Student("Vy", "Hung", "BG")
    )
    with(students) {
        println("Hoc sinh dau danh sach ${first()},")
        println("Hoc sinh cuoi danh sach ${last()}")
    }

    // or
    val firstAndLastStudent = with(students){
        "Hoc sinh dau danh sach ${first()} \nHoc sinh cuoi danh sach ${last()}"
    }

    println(firstAndLastStudent)

    //Hoc sinh dau danh sach Student(firstName=Nguyen, lastName=A, address=HN),
    //Hoc sinh cuoi danh sach Student(firstName=Vy, lastName=Hung, address=BG)

}

*/
