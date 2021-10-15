package bai2

fun main() {
    var SinhVienDiemCao = SinhVien("2019601xxx", "Vy Văn Hùng", "28/08/2001", "Nam", 7.1,"Tốt")
    var SinhVienDiemThap = SinhVien("2018782xxx", "Nguyễn Văn A", "21/01/2001", "Nam", 7.3,"Tốt")
    if(SinhVienDiemCao.diemTB < SinhVienDiemThap.diemTB){
        SinhVienDiemCao = SinhVienDiemThap.also { SinhVienDiemThap = SinhVienDiemCao }
    }
    println("Sinh Viên Diem Cao :")
    SinhVienDiemCao.HienThi()
    println("Sinh Viên Diem Thấp :")
    SinhVienDiemThap.HienThi()
}