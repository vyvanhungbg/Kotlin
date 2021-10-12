import myMath.*
fun main() {
//    var str = helloHung()
//    println(str)
//
//    helloNam()
//    yourName("Hong")
//    myName("Vy Van Hung")
//    baAnhEm("Nam",third = "Long")
//    baAnhEm("Nam","Long") // lỗi vì nó hiểu Long là đối số thứ 2
//    println(sum(4,5))

//    Hàm nhiều đối số

    println(getSum(1,2,3,4,54,))
    getFullName("Vy", "Hung")

    println(myMath.getPi())
}

fun helloNam():Unit { // hàm không trả về
    println("Hello Nam !")
}

fun helloHung():String {    // hàm trả về
    return "Hung"
}

fun yourName(name: String):Unit{
    println("Tên bạn là : $name")
}

// tham so mac dinh  nếu không truyền mặc định sẽ là Hùng
fun myName(name:String = "Hùng" ){
    println("Tên tôi là : $name")
}

// Trường hợp đặc biệt gọi tên biến chỉ định trong hàm
fun baAnhEm(first:String , second:String = "Hùng", third:String ){
    println("Người 1 : $first \n Người 2 : $second \n Người 3 : $third")
}

// Hàm 1 dòng ngắn gọn
fun sum(a:Int, b:Int) = a+b


// Hàm không giới hạn tham số
fun getSum(vararg numbers: Int):Int {
    var sum = 0
    for(i in numbers)
        sum += i
    return sum
}

// Hàm trong hàm ( Hàm cục bộ)
fun getFullName(ho:String , ten:String){
    fun fullName(ho:String , ten:String):String{
        return "$ho $ten"
    }
    println(fullName(ho,ten))
}


