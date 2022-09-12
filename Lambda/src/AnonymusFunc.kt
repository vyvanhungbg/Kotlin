val S = fun(x:Int, y:Int) = x*y

val P = fun(x:Int, y:Int){
    println("$x + $y = ${x+y}")
}
fun main() {
    println( S(3, 5) ) // 15
    P(4, 5)  // 4 + 5 = 9
}