class WhenExample {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val a:Int = 4
            val b = 6
            // if have return
            val max = if(a > b) a else b;
            //print(max)

        // when instead of switch case
            when(a){
                1 -> print("a == 1")
                2 -> print("b == 2")
                else -> {
                    println("Khác")
                }
            }
        //When have many case
            when(b){
                4,6,7 -> println("b = 4 or 5 or 6")
                else -> println("b # 4 or 5 or 6")
            }

        //When with fun
            val str:String = "6"
            val check = 5
            when(check)
            {
                Integer.parseInt(str) -> println("parse str to Int")
                else -> {
                    println("Not parse str")
                }
            }

        // When in range and not in range [a:b] , or list
            var validNumbers = arrayListOf<Int>(1,11,111)
            when(check){
                in 1..10 -> println("$check in range [1:10]")
                in 1..7 -> println("$check in range [1:7]")
                !in 1..10 -> println("$check not in range [1:10")
                in validNumbers -> println("$check in list array")

            }

        // Use when in to func return
           println("str start with Hung ${startWithHung("Hung123")}")
        }

        fun startWithHung(x: Any) = when(x){
            is String -> x.startsWith("Hung")
            else -> false;
        }
    }



}