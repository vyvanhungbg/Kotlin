package ortherFunc

class MyLambda {
   companion object{

       // Hàm lambla receiver có tham số truyền vào là String và trả về là Unit
       fun doSomeThingWith(number: Int, receiver:(String) -> Unit){
           val str:String = when(number){
               0 -> "0"
               in 1..10 -> "[1:10]"
               else -> ">10"
           }
           receiver(str)

       }

       fun doSomeThingWith2(receiver:(String) -> Unit, number: Int, ){
           val str:String = when(number){
               0 -> "0"
               in 1..10 -> "[1:10]"
               else -> ">10"
           }
           receiver(str)

       }

       // hàm này là đối số của hàm trên gọi qua dấu :
       fun myPrintln( string: String):Unit{
           println("Kết quả : $string")
       }


       // Function Literal
       // 2 hàm này thực hiện chức năng như nhau
       val m = {x:String -> println(x)}
       val n : (String) -> Unit = {x -> println(x)}



   }

}

// Hàm lambla receiver có tham số truyền vào là String và trả về là Unit
fun doSomeThingWith(number: Int, receiver:(String) -> Unit){
    val str:String = when(number){
        0 -> "0"
        in 1..10 -> "[1:10]"
        else -> ">10"
    }
    receiver(str)

}
fun myPrintln(string: String):Unit{
    println("Kết quả : $string")
}


fun doSomeThingWith1(number: Int, receiver:(String) -> Unit){
    val str:String = when(number){
        0 -> "0"
        in 1..10 -> "[1:10]"
        else -> ">10"
    }
    receiver(str)

}
fun main() {
    doSomeThingWith(4, ::myPrintln) // Kết quả : [1:10]
    doSomeThingWith(3, fun(string:String){ println("Kết quả : $string") })  // anonymous
    doSomeThingWith(11, { string:String -> println("Kết quả : $string")  }) // lambda
}



/*
fun main() {
    val x = 3
    val y = 5
    val sum = {x : Int, y : Int -> x + y}
    val sum2: (Int, Int) -> Int = {x, y -> x+y}
    println("$x + $y = ${sum(x, y)}")  // 3 + 5 = 8
    println("$x + $y = ${sum2(x, y)}") // 3 + 5 = 8
}*/
