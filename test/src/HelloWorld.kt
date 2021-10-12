import kotlin.reflect.typeOf

fun main(args:Array<String>){
    // bien // cu phap var ten_bien:kieu_du_lieu = gia_tri_khoi_tao
    var name:String = "Hung"
    var age:Int = 20

    // tự động nhận kiểu nếu không khai báo rõ
    var soThich = "Da bong"
    //println("tên là : " + name + "\ntuoi : "+age + "\nso thich : "+soThich)

    // Hằng khai báo bằng từ khóa val
    val pi = 3.14
   // pi = 20.0
    println(pi)

    // Các kiểu dữ liệu như Long, Int, Short, Byte
    // Số thức như Double , float
    var heSoLuong = 3.14
    var heSo = 3.14f
    println(heSoLuong is Double) // mac dich khoi gan so thuc se là kiểu Double // kieu float sẽ thêm dấu f đằng sau
     // tương tự
    var tuoi = 10 // kieu Int
    var nam = 20L // kieu long


    // Các toán tử || && ! tương tự JAva
//    Kiểu String
    name = "Vy Van Hung" // => kieu string co ban
    name = """
        dong 1
            dong 2
        dong 3
    """.trimIndent()
    // """ text """ sẽ giữ nguyên định dạng của các kí tự đặc biệt
//    println(name)
    name = "Vy Van Hung"
    println("tên là :${name}  tuổi : $tuoi ")

    //
}

