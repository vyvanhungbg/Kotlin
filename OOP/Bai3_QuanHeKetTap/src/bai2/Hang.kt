package bai2

class Hang(var maHang:String, var tenHang:String, var nsx: NSX) {
    fun xuat(){
        println("$maHang\n$tenHang")
        nsx.xuat()
    }
}