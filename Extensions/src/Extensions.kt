class Extensions {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val list = mutableListOf<Int>(1, 0,2, 3, 4)
            println(list.toString())

            list.swap(0,1)
            println(list.toString())

        // Nếu mở rộng cùng tên với hàm của class , có cùng cả tham số , thì hàm được gọi là hàm gốc , ko phải extension
            val c:C = C()
            c.foo()

        //Tuy nhiên nếu hàm mở rộng có đối số khác thì , lúc này sẽ trở thành overloading , đương nhiên hàm extension đó được gọi
            c.foo(2)


        // Có thể khởi tạo Extension fun cho Lớp Any
            val str:String? = null
            println(str.toString())

        //Extension cho thuộc tính
            println(c.name)

        // Companion Object Extensions
            C.hello()

            val user:User = User("Hung")
            val (name, age) = user

            println("$name va $age")

        }



    }
}
fun MutableList<Int>.swap(index1:Int, index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp;
}

fun C.foo(){
    println("Extension1")
}

fun C.foo(a:Int){
    println("Extension2")
}

fun C.Companion.hello(){
    println("Hello")
}

val C.name:Int
    get() = 1

fun Any?.toString():String{
    if(this == null)
        return "NULL";
    return toString();
}