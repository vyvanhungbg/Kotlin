fun main() {
    var hung = SinhVien()
    hung.xuat()
    hung.Ma = 123
    hung.Ten ="Vy Văn Hùng"
    hung.xuat()
    println(hung) //  in ra thoong tin nếu overide pt toString()
}