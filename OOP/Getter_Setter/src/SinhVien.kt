class SinhVien {
    private var ma:Int=0
    private var ten:String=""
    public var Ma:Int
        get()
        {
            return ma
        }
        set(value)
        {
            ma=value
        }
    public var Ten:String
        get()
        {
            return ten
        }
        set(value)
        {
            ten=value
        }
    constructor()
    {
        ma = 0
        ten = ""
    }
    constructor(ma:Int,ten:String)
    {
        this.ma = ma
        this.ten = ten
    }
    fun xuat(){
        println("$ma : $ten")
    }

    override fun toString(): String {
        return "SinhVien(ma=$ma, ten='$ten')"
    }


}
