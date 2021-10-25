class NhanVienThoiVu:NhanVien() {
    init {
        println("Đây là Nhân Viên Thời Vụ")
    }
    override fun tinhLuong(ngayCong: Int): Double {
        return ngayCong*10.0
    }
}