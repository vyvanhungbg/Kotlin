package phieu_kiem_ke_tai_san

class Phieu(var maPhieu:String, var ngayKiemKe:String, var thongtinKiemKe:KiemKe, var taiSan: Array<TaiSan?>) {
    fun xuat(){
        println("""
            
            Mã phiếu : $maPhieu             Ngày kiểm kê : $ngayKiemKe
        """.trimIndent())
        thongtinKiemKe.xuat()
        for (i in taiSan)
            i?.let { i.xuat() }
    }

    fun sua(){
        for (i in taiSan){
            if(i?.tenTaiSan.equals("May vi tinh"))
                i?.soLuong = 20
        }
    }
    fun chen(){
        for (i in taiSan.size-1 downTo 2 ){
            taiSan[i] = taiSan[i-1]
            taiSan[2] = TaiSan("Laptop", 10, "Tốt")
        }
    }
    fun sapXep(){
        for (i in 0..taiSan.size-1){
            for (j in i+1..taiSan.size-1){
                if(taiSan[i]!!.soLuong > taiSan[j]!!.soLuong){
                    taiSan[i] = taiSan[j].also { taiSan[j] = taiSan[i] }
                }
            }
        }
    }
}