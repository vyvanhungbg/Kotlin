package phieu_kiem_ke_tai_san

import java.lang.reflect.Array

fun main() {
    var thongTinKiemKe = KiemKe("Nguyễn A","Kế toán viên", "Tổ chức hành chính", "PTC","Vy Văn B")
    var taiSan = Array<TaiSan?>(4){ null }
    taiSan[0] = TaiSan("May vi tinh", 5, "Tốt")
    taiSan[1] = TaiSan("Máy vi tính", 3, "Hết khấu hao- hỏng")
    taiSan[2] = TaiSan("Bàn làm viêc", 6, "Tốt")


    var phieu = Phieu("PH01","1/1/2020",thongTinKiemKe,taiSan)
    with(phieu) {
        xuat()
        sua()
        chen()
        sapXep()
        xuat()
    }

}