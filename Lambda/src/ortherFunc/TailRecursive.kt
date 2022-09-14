fun Fact1(num: Int, x:Int):Long{  // đệ quy đuôi
    println("Fact1 call ")

    return if(num==1)   // terminate condition
        x.toLong()
    else{
        println("Fact1 calc with value  = ${x}")
        Fact1(num-1,x*num)
    }
         //tail recursion
}

tailrec fun Fact3(num: Int, x:Int):Long = if(num == 1) {  x.toLong()  }else  Fact3(num-1,x*num)


fun Fact2(num:Int , x:Int):Long{  // đệ quy đầu
    println("Fact2 call")

    return if(num == 1)
        x.toLong()
    else{
       val a =  num  * Fact2(num-1, x)
        println("Fact2 calc with value  = ${a}")
        a
    }
}
fun main() {
    val n = 1
    val number = 3
    println("Factorial1  of 5 is: ${Fact1(number, n)}")
    println()
    println("Factorial2  of 5 is: ${Fact2(number, n)}")
    println()
    println("Factorial2  of 5 is: ${Fact3(number, n)}")
}