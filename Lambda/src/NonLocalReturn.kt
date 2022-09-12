inline fun myEvaluate( lambda : (Int, Int) -> (Int)) :Int{
    return lambda(1,2)
}

fun nonInline(): Int {
    println("before lambda")
    val lambda = myEvaluate({ a, b -> return 1 })
    println("lambda = ${lambda}")
    println("after lambda")
    return 1
}

fun anonymousEx(){
    println("before anonymous")
    val ano = fun(a:Int, b:Int):Int{
        return a+b
    }
    println("anonymous = ${ano(3, 5)})")
    println("after anonymous")
}

fun main() {
    println(nonInline())  //before lambda - 1
    anonymousEx() // before anonymous - anonymous = 8 - after anonymous

    // Lambda trả về hàm ngoài
    // Anonymous trả về hàm chính nó
}

