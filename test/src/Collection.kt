fun main() {

    // MutableList là collection có thể thay đổi kích thuớ dữ liệu { thêm , sửa xoá}
    // List là collection có nhiệm vụ readOnly, dùng để hiển thị thông tin , tối ưu hơn so với MutableList
   // var ds1:MutableCollection<Int> = mutableListOf()
    var ds:List<Int> = listOf(1,2,3,4,5,8)

    for (i in ds.indices)
        println("${ds[i]}")
    ds = ds.sorted()
    ds = ds.sortedDescending()
    println("Mảng sau khi sắp xếp giảm là :")
    for (i in ds.indices)
        println("${ds[i]}")
    // tương tự filter, max, min, sum, averger

    // MutableList
    println("List :")
    var list = mutableListOf<Int>(1,2,3,4)
    list.add(100)
    list.addAll(mutableListOf(7,0))

    println("List là : ")
    xuat(list)
    list.removeAt(3)//xóa phần tử tại vị trí thứ 3
    println("Các phần tử trong MutableList sau khi xóa:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    list.sort()//sắp tăng dần
    println("Các phần tử trong MutableList sau sắp tăng dần:")

    println()
    list.sortDescending()//sắp giảm dần
    println("Các phần tử trong MutableList sau sắp giảm dần:")
    xuat(list)
    println()
    println("SUM="+list.sum())
    println("MAX="+ list.maxOrNull())
    println("MIN="+ list.minOrNull())
    println("AVERAGE="+list.average())

}
fun xuat( ds:MutableList<Int>){
    for(i in ds.indices)
        print("${ds[i]}\t")

}