
// INNER CLASS
// Một lớp được đánh dấu là bên trong để có thể được truy cập từ lớp bên ngaoif
// Các lớp Inner mang một tham chiếu đến một đối tượng của lớp bên ngaoif

// LỢI ÍCH Inner class đcos thể truy cập các thành phần data , function ngay cả khi nó private ( Ưu điểm so với nested)

// INNER CLASS không thể được khai báo bên trong các interface hoặc các non-inner nested class ( Các class lồng nhau mà không phải Inner class)



//OUTER CLASS
// Dùng trong một số trường hợp khi các bạn muốn tạo một class có các thuộc tính và phương thức riêng
// nhưng có liên hệ mật thiết với một Outer class, ( không hẳn là kế thừa)
//Chỉ muốn Outer class chứa nó sử dụng để có thể thỏa mái truy cập mà không cần khởi tọa object



//

class Outer {
    private val bar: Int = 1
    inner class Inner{
        fun foo() = bar
    }

    class Nested{
        fun  foo() = 1 // không thể dùng bar
    }
}
val  demo1 = Outer.Nested().foo()
val  demo2 = Outer().Inner().foo()