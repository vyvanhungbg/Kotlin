fun main()
{
    var mang1 = arrayOf(1, 2, 3, 4, 7.5, "hung") // mang nhiều kiểu dữ liệu
    var mang2 = arrayOf<Int>(1,2,3 ,4, 45) // mang kiểu int
    var mang3 = intArrayOf(9, 0,3, 4, 3) // mảng kiểu int
    // tương tự charArrayOf ... boolean , long..., short, byteArrayOf

    val mang4 = Array(5,{i -> i * i}) // khai báo mảng với só lượng phần tử cho trước

    for (i in mang1)
        println(i)


}