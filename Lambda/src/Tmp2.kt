open class A {
    open fun sum(a:Int = 1, b:Int = 2) = a+b
}
class B : A(){
    /*override fun sum(a:Int = 1, b:Int = 2): Int {  // An overriding function is not allowed to specify default values for its parameters
        return  a + b
    }*/
    override fun sum(a: Int, b: Int): Int  = a + b
}
fun main() {
    val a = 5
    val b = 6
    println( B().sum(a, b) )  // 11
    println( B().sum() )   // 3
}