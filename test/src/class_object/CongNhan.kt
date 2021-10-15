package class_object

class CongNhan( name:String ,  ngaySinh:String,  tuoi:Int, var luong: Double):Nguoi(name, ngaySinh, tuoi) {

    override fun infor() {
        println("Thông tin công nhân :")
        super.infor()
        println("Lương : ${luong}")
    }
}