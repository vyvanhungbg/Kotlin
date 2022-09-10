

// Nếu không chỉ rõ variable cho contructor mặc định là val  và không get, set được
//  VD : class Person constructor(name: String){}

// Từ khóa constructor có thể không cần thiết nếu không cần các anotation (@inject , private)
//  VD : class Customer private @Inject constructor(name:String)

open class Person (var name:String) {

// Khối khởi tạo
    init {
        println("Khởi tạo person")

    }

// Hàm khởi tạo thứ cấp Secondary constructor bắt đầu bằng từ khóa constructor
// NẾU lớp có hàm khởi tạo chính thì , hàm khởi tạo thứ cấp cần ủy quyền cho hàm khởi tạo chính
    constructor(name: String, age: String):this(name){
        this.name = name
    }

    open fun go(){
        println("Person go")
    }

    open fun eat(){
        println("Person eat")
    }

}