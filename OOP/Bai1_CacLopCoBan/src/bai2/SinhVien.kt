package bai2

class SinhVien(var maSinhVien: String, var hoTen:String, var ngaySinh:String, var gioiTinh:String, var diemTB:Double, var hanhKiem:String) {
   fun HienThi(){
       println("Mã SV : ${maSinhVien} - Họ tên : ${hoTen}")
   }
}