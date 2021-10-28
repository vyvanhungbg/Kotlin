class SanPham(var ma:Int, var ten:String, var donGia:Double) {
    constructor():this(0,"",0.0){}

    override fun toString(): String {
        return "$ma\t$ten\t$donGia"
    }
}