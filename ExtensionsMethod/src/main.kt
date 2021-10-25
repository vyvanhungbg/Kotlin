fun main() {
//    Thêm hàm ++ vào Class Int

    fun Int.isEven():Boolean{
       return this % 2 ==0
    }

    var a:Int = 5
    a = a.CongCong()
    println("a = $a")


    //
    println("a là số chẵn = ${a.isEven()}")
}

fun  Int.CongCong(): Int{
   return  this+1
}