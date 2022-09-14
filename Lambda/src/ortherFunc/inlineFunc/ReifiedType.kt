/*fun <T> checkType1(obj : Any):Boolean{
    return obj is T   //Cannot check for instance of erased type: T
}*/
inline fun <reified T> checkType(obj: Any):Unit = when{
    obj is Int  -> println("Class Int")
    obj is String-> println("Class String")
   // obj is T -> println("T :  ${T::class.simpleName}")// co the truy cap dc T trong thoi gian chay
    else -> println("obj :  ${obj::class.simpleName}")
}
fun main() {

    checkType <Any>("23")  // Class String
    checkType <Any>(23)  // Class Int
    checkType <Float>(23.5F)  // # Float
}
//"reified" là một loại từ khóa đặc biệt truy cập thông tin liên quan đến một lớp trong thời gian chạy