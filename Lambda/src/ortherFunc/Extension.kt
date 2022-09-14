package ortherFunc



class C {
    fun foo(){
        println("member")
    }
}

fun C.foo(a:Int = 2){
    println("Extension2")
}
fun main(args: Array<String>) {
    // Nếu mở rộng cùng tên với hàm của class , có cùng cả tham số
    // , thì hàm được gọi là hàm gốc , ko phải extension
    val c:C = C()
    c.foo()  // print member
    //Tuy nhiên nếu hàm mở rộng có đối số khác thì ,
    // lúc này sẽ trở thành overloading , đương nhiên hàm extension đó được gọi
    c.foo(2)  // print Extension2


}