package phieu_kiem_ke_tai_san

class TaiSan(var tenTaiSan:String, var soLuong:Int, var tinhTrang:String) {
    fun xuat() = println("""
        $tenTaiSan          $soLuong            $tinhTrang
    """.trimIndent())
}