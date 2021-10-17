package phieu_kiem_ke_tai_san

class KiemKe(var nhanVienKiemKe:String, var chucVu:String, var phong:String, var maPhong:String, var truongPhong:String) {
    fun xuat() = println("""
       Nhân viên kiểm kê : $nhanVienKiemKe           Chức vụ : $chucVu
       Kiểm kê tại phòng : $phong                    Mã phòng : $maPhong
       Trưởng phòng : $truongPhong
    """.trimIndent())
}