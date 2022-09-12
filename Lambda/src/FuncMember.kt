open class C {
    open fun sum1(a :Int , b:Int) = println("Do some Thing sum1  of C")
    open fun sum2(a :Int , b:Int = 3) = println("Do some Thing sum2 of C")
    open infix fun myInfix(a : Int) = println("Do some thing myInfix of C")
   // open final fun myFinal() = println("Do some thing myFinal")
    open operator fun invoke() = println("Do some thing invoke of C")
}

class F : C() {
    override fun sum1(a: Int, b: Int) {
        super.sum1(a, b)
        println("Do some Thing sum1 of F\n")
    }

    override fun sum2(a: Int, b: Int) {
        super.sum2(a, b)
        println("Do some Thing sum2 of F\n")
    }

    override fun myInfix(a: Int) {
        super.myInfix(a)
        println("Do some Thing myInfix of F\n")
    }

    override fun invoke() {
        super.invoke()
        println("Do some Thing invoke of F\n")
    }
}

fun main() {
    val a = 1
    val b = 2
    // Gọi hàm với đầy đủ đối số
    C().sum1(a, b)
    F().sum1(a, b)

    C().sum2(a)
    F().sum2(a)  //OK Mặc dù trông hàm F không có đối số mặc định

    C() myInfix 3
    F() myInfix 3

    C().invoke()
    F().invoke()
}