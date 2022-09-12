import MyLambda.Companion.myPrintln

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyLambda.doSomeThingWith(1,::myPrintln)



            //Thay vì truyền refencen vào , ta định nghĩa luôn fun pử àument
            MyLambda.doSomeThingWith(1,fun(result:String?){
                println("In kiểu tự khai báo trong argument : $result")
            })

            MyLambda.doSomeThingWith(0, {
                result ->
                println("In kiểu lambda 1 : $result")
            })

            MyLambda.doSomeThingWith(100, {
                s : String ->
                println("In kiểu lambda 2 : $s")
            })

            // param cuối là function thì có thể khai báo lambda funcion bên ngoài ()
            MyLambda.doSomeThingWith(11) {
                s ->
                println("In kiểu lambda 3 : $s")
            }

            // it ở đây là đại diện cho pramter ngầm định của fun lambda
            MyLambda.doSomeThingWith2({
                println("In kiểm lambda trước param cuối $it")
            }, 10)


            //KHÁC JAVA là chỉ sử dụng ddocwj các biến , param ở vùng bên ngoài nếu như là final
            val sum:Int = 10;

            MyLambda.doSomeThingWith(10){
                println("Sử dụng thuộc tính ngoài $it, dùng $sum")
            }

           /* val list : List<Int> = listOf(1, 2, 3)
            list.add(4)
            print(list)*/
            val  invokeFun:InvokeFun = InvokeFun("Hun")
            invokeFun("alo")

            val a = 5.5;
            print(Math.sqrt(a))
        }
    }
}