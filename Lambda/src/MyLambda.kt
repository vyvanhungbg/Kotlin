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