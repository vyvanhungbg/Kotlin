import myMath.getDate

fun main() {
    println(getDate()) // top-level function đuocwj gọi từ package myMath.kt

    // lambda
    var message = {             // hàm đuọcw gán vào một biến
        println("My name is Hung")
    }
    message()

    // hàm lambda có truyền tham số
    var myName = {
        str:String->
        println("Tên tôi là : $str")
    }
    myName("Long")


    //lambda trả về giá trị
    var myLambda = {a:Int,b:Int -> a+b }
    println(myLambda(5,6))

    // hàm lamda tro
    val listPlayer = arrayOf<String>("Ronaldo", "Messi", "Neymar", "Suarez", "Benzema", "Ramos")
    val listR = listPlayer.filter {
        it.startsWith("R")
    }
    println(listR)

    // Nếu hàm mà chua lambda làm đối số truyền vào thì có thể sử dụng it làm tham số -? tìm hiểu thêm
    listPlayer.forEach {
        if(it.equals("Messi")){
            println("True")
            return
        }

    }


    fun String.upperFirstLetter():String{
        val firstLetter = this.substring(0,1).toUpperCase()
        return firstLetter.plus(this.substring(1))
    }

    var name = "hung"
    print(name.upperFirstLetter())


//    Tự tìm hiểu
//fun testReturnFunction() {
//    val intList = intArrayOf(1, 3, 5, 7, 9)
//    intList.forEach labelForEach@ { // Định nghĩa nhãn labelForEach cho hàm forEach, khi muốn return sẽ dùng đến nhãn này
//        if (it % 3 == 0) {
//            return@labelForEach // Câu lệnh này chỉ kết thúc hàm có nhãn labelForEach
//        }
//    }
//    println("End of testReturnFunction()")
//}


    /// Hàm mở rộng Extension function
    // ví dụ cho lop String
    // định nghĩa hàm

}