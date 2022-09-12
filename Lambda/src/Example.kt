import java.lang.IllegalArgumentException

/*fun main() {
    val a = 1
    val b = 2
    println( sum1(a ) )    //   1  // với đối số mặc định đứng sau
    println( sum1(a, b) ) //   3  //

   // println( sum2(a) ) // ERROR No value passed for parameter b
    println( sum2(b = b, ) ) // 5  // Cần chỉ rõ đối số b nếu đối số mặc định đứng trước đối số  không có mặc định

   // println( sum2(b = 5, 2)) // ERROR  Mixing named and positioned arguments is not allowed
    println( sum3(a = 5, 2))  // 7   //Tất cả các đối số vị trí nên được đặt trước tên đầu tiên

    sum4(a, b)   // Nếu không có trả về hoặc thì trong kotlin sẽ là kiểu Unit
}*/

fun sum1(a:Int , b:Int = 0 ): Int{
    return a + b
}
fun sum4(a:Int, b:Int){
    println("$a + $b = ${a + b}")
}
fun sum2(a: Int =3, b: Int) = a + b
fun sum3(a: Int , b: Int = 5) = a + b


/*fun sum1(a:Int, b:Int):Int{
    return a+b;
}

fun sum2(a:Int, b:Int) = a+b   // có thể bỏ qua kiểu trả về

fun sum3(a:Int, b:Int){    // trả về mặc định là Unit
    println("$a + $b = ${a+b}")
}*/

fun max(a:Int, b:Int) = if(a > b) "a > b" else "a <= b"

fun getBaseColorCode(color: String) = when (color){
    "Red" -> 0xff0000
    "Green" -> 0x00ff00
    "Blue" -> 0x0000ff
    else -> throw IllegalArgumentException("Invalid base color")
}


fun main() {
    val arr = intArrayOf(1, 2, 3, 4)
    val a = 5
    val b = 6
    println("Sum = ${sum(a, b, *arr)}")
}

fun sum(vararg input:Int):Int{
    var sum = 0
    for (i in input)
        sum += i
    return sum
}