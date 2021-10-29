import java.nio.file.Paths

fun main() {
    var data:MutableList<SanPham> = mutableListOf()
    var database:MutableList<Any> = mutableListOf()
    var item1 = SanPham(1,"Fanta",16.0)
    var item2 = SanPham(2,"Sting",8.0)
    var item3 = SanPham(3,"RedBull",12.0)
    data.add(item1)
    data.add(item2)
    data.add(item3)

    var database1:DanhMuc = DanhMuc(1, "Thức uống ",data)
    var database2:DanhMuc = DanhMuc(1, "Đồ ăn ", mutableListOf())
    database.add(database1)
    database.add(database2)


//    var path:String = Paths.get(".").toAbsolutePath().normalize().toString()+"/data.txt";
//    var status:Boolean = JsonFileFactory().SaveFile(data,path)
//    if(status)
//        println("Lưu file thành công !")
//    else
//        println("Lưu file thất bại !")
//
//    /// Đọc file
//    var dataFromFile: MutableList<SanPham>  = JsonFileFactory().ReadFile(path)
//    println(dataFromFile.toString())


    var path:String = Paths.get(".").toAbsolutePath().normalize().toString()+"/database.txt";
    var status:Boolean = JsonFileFactory().SaveFile(database,path)
    if(status)
        println("Lưu file thành công !")
    else
        println("Lưu file thất bại !")

    /// Đọc file
    var dataFromFile: MutableList<Any>  = JsonFileFactory().ReadFile(path)
    println(dataFromFile.toString())
}