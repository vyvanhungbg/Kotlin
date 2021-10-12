fun main() {
     val a = 10
     val b = 20

     // cau đieu kiện cơ bản  có thẻ lồng và sử dụng các toán tử như || , &&, !
     if(a < b){
          println("$a < $b")
     }else if (a > b ){
          println("$a > $b")
     } else{
          println("$a == $b")
     }

     // Câu điều kiện trả về giá trị
     var max = if(a < b){
          println("$a < $b")
          b
     }else if (a > b ){
          println("$a > $b")
          a
     } else{
          println("$a == $b")
          a
     }
     println("max a va b : $max")

     // Lựa chọn điều kiện tương tự switch case trong java . Nhưng ở đấy case có thể là biểu thức , hoặc hàm
     var age = 20
     when(age){
          20 -> println("20 tuoi")
          40/2 -> println("40 / 2 tuoi  ")

          in 1..16 -> println("Trẻ con")
          in 18..40 -> println("Người Lớn")
          else -> println("Old") // xử lí cuối cùng giống default
     }

     // VÒNG LẶP

     // while
     var myArray = arrayOf("Hung", 20 , 99.2)
     var i = 0
     while (i<3){
          println(myArray[i++])
     }

     // do while
     i = 0
     do {
          println(myArray[i++])
     }while (i<3)

     // for
//     for (i in 1..7)
//          println("i = $i")
//
//     for (i in 1..7 step 2)  // thay đổi bước nhảy i
//          println("i = $i")

//     for (i in 5 downTo 1  step 2)  // khong the i in 5..1 mà cần dùng tư khóa downTo
//          println("i = $i")

     for(i in 0..myArray.size -1){
          println(myArray[i])
     }
     // break và continue giống trong java
     println("Break và contine")
     for(i in 1..10){
          if(i %2 ==0)
               continue
          println("$i là số lẻ !")
     }

}