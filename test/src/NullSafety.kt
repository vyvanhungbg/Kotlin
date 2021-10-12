fun main(){
    // Khởi tạo biến null
    var variable = null // khởi tạo được nếu không xác định kiểu từ đầu
    var  name:String = "Hung"
//    name = null  // lỗi vì không thể gán null cho kiểu dữ liệu null
//    println(name)

    // không khởi tạo giá trị
//    var tuoi:String // lỗi không khởi tạo giá trị
//    println(tuoi)

    // KIỂU DỮ LIỆU CÓ THỂ NULL
    var soThich:String? = null  // toán tử ? cho phép biến đó có kiểu dữ liệu non-null nhưng có thẻ null
    println(null)

    /////////// XỬ LÍ NULL
    /// Xử lí với biến null cần lời gọi an toàn Safe call

    var lengOfSoThich = soThich?.length // toán tử ? sẽ xác định / Nếu soThich == null thì sẽ trả về null cho lengthOfSoThich . Nếu không trá về cho độ dài soThich
    println(lengOfSoThich)

    ///
    //lengOfSoThich = soThich!!.length // toán tử !! sẽ gọi length bất kể soThich có null hay không (' nếu so thich null là gãy vì crash ct')
    //println(lengOfSoThich)
    // !! khá nguy hiểm vì biến có thể null nhưng ta bất chấp nó k null :(


    /// sử dụng let xác định nếu không null thì chạy trong let . ngược lại không chạy . Giống if lọc đk
    soThich?.let {
        println(" kq : ${soThich.length}")
    }

    // Toán tử Elvis
    val length = soThich?.length?: -1 // nếu soThich = null thì sẽ ttrả về -1 . ngược lại trả về length of soThich




}