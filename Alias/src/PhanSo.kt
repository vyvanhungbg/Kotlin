class PhanSo :Cloneable{
    var tu:Int=1
    var mau:Int=1

    constructor(tu: Int, mau: Int) {
        this.tu = tu
        this.mau = mau
    }
    fun xuat() = println("$tu / $mau")

    fun copy():PhanSo
    {
        var ps:PhanSo = clone() as PhanSo
        return ps
    }
}
