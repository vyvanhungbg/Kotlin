class NhanVienChinhThuc:NhanVien() ,xinNghi, diemDanh {
    override fun tinhLuong(ngayCong: Int): Double {
        return ngayCong* 12.0
    }

    override fun diemDanh() {
        println("Diem danh")
    }

    override fun xinNghi() {
        println("Xin nghi")
    }


}