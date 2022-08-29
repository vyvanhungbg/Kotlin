class Item {
    var type:String=""
    var imageurl:String=""
    var muatienmat:String=""
    var muack:String=""
    var bantienmat:String=""
    var banck:String=""
    override fun toString(): String {
        return "Mã Tiền Tệ : "+type+"\n"+
                "Mua tiền mặt :"+muatienmat+"\n"+
                "Bán tiền mặt :"+bantienmat+"\n"+
                "Mua chuyển khoản :"+muack+"\n"+
                "Bán chuyển khoản :"+banck+"\n"+
                "Hình đại diện :"+imageurl+"\n"
    }
}
