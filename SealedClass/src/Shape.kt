
// Các lớp Sealed được sử dụng để đại diện cho các phân lớp bị hạn chế
// Cần quản lí giá trị có trong một tập hợp giới hạn, Và không thể có giá trị nào khác trong tập hợp
// Nhìn chung có vẻ chúng như là lớp mở rộng của enum
// Nhưng tập các giá trị của ENUM là hạn chết , không thể chữ nhiều các lớp có kiểu khác nhau
// Một lớp sealed có thể có các lớp con , nhưng phải khai báo một tệp
// Các lớp phải được lồng bên trong KHAI BÁO CỦA LỚP SEALED


// Thuộc tính
//      + Một lớp sealed tự chính nó là trừu tượng
//      + Không thể khởi tạo trực tiếp
//      + Có thể có các thành viên trừu tượng
//      + Các lớp SEALED không được có hàm khởi tạo ngoài private, mặc định là private
//      + Các lớp kế thừa của lớp con trong lớp SEALED có thể được đặt ở bất kì đâu
//      + LỢI ÍCH chính của sử dụng các lớp seal là phát huy sức mạnh trong biểu thực when, Nếu khác báo hết các trường hợp thì ko cần dùng tới else ->

sealed class Shape {
    open class Circle(var radius: Float):Shape();
    class Square(var length: Int):Shape()
    class Rectangle(var length:Int, var breadth:Int):Shape()

}

fun eval(e:Shape) = when(e){
    is Shape.Circle -> println("Circle : ${e.radius * e.radius * 3.14}")
    is Shape.Square -> println("Square : ${e.length * e.length}")
    is Shape.Rectangle -> println("Rectangle : ${e.length*e.breadth}")
}

