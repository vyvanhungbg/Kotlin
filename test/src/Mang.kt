import java.util.*

fun main()
{
    var mang1 = arrayOf(1, 2, 3, 4, 7.5, "hung") // mang nhiều kiểu dữ liệu
    var mang2 = arrayOf<Int>(1,2,3 ,4, 45) // mang kiểu int
    var mang3 = intArrayOf(9, 0,3, 4, 3) // mảng kiểu int
    // tương tự charArrayOf ... boolean , long..., short, byteArrayOf

    val mang4 = Array(5,{i -> i * i}) // khai báo mảng với só lượng phần tử cho trước

   /* for (i in mang1)
        println(i)

    for((index,value )in mang1.withIndex()){
        println("phan tu $index la ${value}")
    }

   for(i in mang1.indices)
       println("phan tu $i la ${mang1[i]}")*/
    var array:IntArray = IntArray(10)

    var rd = Random()
    for(i in array.indices)
        array[i] = rd.nextInt(100)

    println("Giá trị mảng :")
    for (i in array.withIndex())
        println(i)
    println("Max = ${array.maxOrNull()}")
    println("Min = ${array.minOrNull()}")
    println("Sum = ${array.sum()}")
    println("Average = ${array.average()}")
    println("Số Số chẵn = ${array.count{x ->x%2 ==0}}")

    array.sort()
    println("Giá trị mảng :")
    for (i in array.withIndex())
        println(i)

    array.sortDescending()
    println("Giá trị mảng :")
    for (i in array.withIndex())
        println(i)

    var dsSoChan = array.filter { x->x%2 == 0 }
    println("Các só chẵn")
    println("Giá trị mảng :")
    for (i in dsSoChan.withIndex())
        println(i)
}