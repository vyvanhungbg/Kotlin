package bai3

 class CanBo (var maCanBo:String, var hoTen:String, var ngaySinh:String, var soNgayLamViec:Int ){


     fun nhap(){
         println("Nhập mã cán Bộ : ")
         this.maCanBo = readLine().toString()
         println("Nhập ho và tên : ")
         this.hoTen = readLine().toString()
         println("Nhập ngày sinh : ")
         this.ngaySinh = readLine().toString()
         println("Nhập so ngày làm việc ")
         this.soNgayLamViec = readLine()?.toIntOrNull() ?: 0
     }

     constructor():this("","","",0){

     }

    fun tinhLuong() = this.soNgayLamViec*250000
    fun xuat() = println("Mã : ${maCanBo}\nTên : ${hoTen}\nNgày sinh : ${ngaySinh}\nSố ngày làm ${soNgayLamViec}\nLuong : ${tinhLuong()}")
}