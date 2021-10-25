package Interface
interface A{
    fun funOfClassA() = println("fun of class A")
    fun bar() = println("A")
    fun foo() = println("A")
}
interface B{
    fun funOfClassB() = println("fun of class B")
    fun bar()= println("B")
    fun foo() = println("B")
}
class ex1 : A,B{
    override fun bar() {
        super<A>.bar()
        super<B>.bar()
    }

    override fun foo() {
        super<A>.foo()
    }

}

fun main() {
    var x = ex1()
    x.bar()
    x.funOfClassA()
    x.foo()
}