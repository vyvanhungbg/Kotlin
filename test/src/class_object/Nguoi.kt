package class_object

open class Nguoi(var name:String , var ngaySinh:String, var tuoi:Int) {

    var nguoiYeu:String? = null

    open fun infor() {
        println("\nTên : ${name}\nNgày Sinh : ${ngaySinh}\nTuổi : ${tuoi}")
        nguoiYeu?.let {
            println("Người yêu : $nguoiYeu")
        }
    }


    init { // khối lệnh init này sẽ thucwj hiện ngay khi đối tượng đuọcw tạo
        println("Đã khởi tạo đối tượng")
    }

    // secondảy constructor
    constructor(name: String, ngaySinh: String , tuoi: Int, nguoiYeu:String):this(name, ngaySinh, tuoi){
        this.nguoiYeu = nguoiYeu
    }


}