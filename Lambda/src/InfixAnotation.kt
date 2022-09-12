open class M{
    open infix fun doubleNumber(a : Int) =  println("M = ${a * 2}")
}
class D : M(){
    override fun doubleNumber(a: Int) {
        super.doubleNumber(a)
        println("D = ${a * 2}")
    }

    fun doSomeThing(){
        this doubleNumber 5     //  10 phải gọi receiver
        M() doubleNumber 5
        //doubleNumber 6   // ERROR
    }
}

fun main() {
    D().doSomeThing()
}

/*fun main() {
    val a = 3
    val b = 5
    println("$a + $b = ${ a.myPlus(b) }")  // 3 + 5 = 8 thông thường gọi hàm
    println("$a + $b = ${ a myPlus b }")  // 3 + 5 = 8 với infix
}

//infix fun sum(a :Int) = a  // ERROR phải là member func or extension func
infix fun Int.myPlus(a : Int) = this + a*/

