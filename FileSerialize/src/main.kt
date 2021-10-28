import java.nio.file.Paths

fun main() {
    var data:MutableList<SanPham> = mutableListOf()
    var item1 = SanPham(1,"Fanta",16.0)
    var item2 = SanPham(2,"Sting",8.0)
    var item3 = SanPham(3,"RedBull",12.0)
    data.add(item1)
    data.add(item2)
    data.add(item3)
    var path:String = Paths.get(".").toAbsolutePath().normalize().toString()+"/data.txt";
    var status:Boolean = SerializableFileFactory().SaveFile(data,path)
    if(status)
        println("Lưu file thành công !")
    else
        println("Lưu file thất bại !")

    /// Đọc file
    var dataFromFile: MutableList<SanPham>  = SerializableFileFactory().ReadFile(path)
    println(dataFromFile.toString())
}