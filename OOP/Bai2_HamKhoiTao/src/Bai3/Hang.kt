package Bai3

class Hang(var maHang:String, var tenHang:String, var ngayNhap:String, var ngayXuat:String, var donGia:Double, var soLuong:Int) {
    constructor():this("","","","",0.0,0)

    fun label() = System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s","mã hàng","tên hàng", "ngày nhập", "ngày xuất","đơn giá","số lượng","thành tiền")
    fun xuat(){
        label()
        System.out.printf("%n%-14s %-14s %-14s %-14s %-14.3f %-14d %-14.3f",maHang,tenHang,ngayNhap,ngayXuat,donGia,soLuong,donGia*soLuong)
    }
}