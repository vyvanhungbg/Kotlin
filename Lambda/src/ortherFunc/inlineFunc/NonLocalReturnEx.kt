package ortherFunc.inlineFunc

fun doSomething() {
    println("Before lambda")
    doSomethingElse({
        println("Inside lambda")
        return   // This is non-local return
    })
    println("After lambda")
}

fun doSomething1() {
    println("Before lambda")
    doSomethingElse({
        println("Inside lambda")
        return@doSomethingElse  // This is local return
    })
    println("After lambda")
}

// crossinline ngăn không cho non-local return trong các hàm local lồng nhau
/*inline fun doSomethingElse(crossinline lambda: () -> Unit) {  //
    println("Do something else")
    lambda()
}*/

inline fun doSomethingElse( lambda: () -> Unit) {
    println("Do something else")
    lambda()
}

fun main() {
    doSomething() // Before lambda - Do something else - Inside lambda
    //trả về không cục bộ vì không trả về lambda mà trả về doSomething()

    println()
    // Nếu chỉ trả về từ lambda
    //doSomething1() //  Before lambda - Do something else - Inside lambda - After lamba
    println("end")
}