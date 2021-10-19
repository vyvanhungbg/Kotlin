import javax.crypto.EncryptedPrivateKeyInfo

fun main() {
    // Data class là lớp chỉ chứa dữ liệu chứ không có phương thức
    data class User(var userName:String, var password:String)
    var user1 = User("abc","123@")
    var user2 = user1.copy()
    var user3 = user1.copy(password = "thay doi")
    println(user1.toString())
    println(user2.toString())
    println(user3.toString())

    // Outer and Nested class
    var x = Outer()
    Outer.Nested().show()  //  gọi từ tên class
   // Outer.Nested().show1()
    x.Inner().show()    // gọi từ instance
    x.Inner().show1()


    // Emum class
    var diem:Int = 7
    var hanhKiem:String?
    if(diem>7)
        hanhKiem = Enum.XuatSac.toString()
    else
        hanhKiem = Enum.Gioi.toString()
    println("Hanh kiem la $hanhKiem")
}