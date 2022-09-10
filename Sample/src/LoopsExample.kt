class LoopsExample {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val array = arrayListOf<Int>(1, 2, 4, 7, 10)

        // For each basic
            for(item in array)
                println(item)

        // For range [1:3]
            for(item in 1..3)
                println(item)

        // For downTo range [5:1]
            for(item in 5 downTo 1)
                println(item)

        // For with stept
            for(item in 1..10 step (3))
                println("For with step 3 ${item}")

        // For with index
            for(i in array.indices)
                println("array[$i] = ${array[i]} ")

        // For with pair (index , value)
            for((index, value) in array.withIndex())
                println("With index : $index is $value")

        // While loop same java
            var m = 5
            while (m >= 0){
                println("while 5 -> 0 : ${m}")
                m--
            }
        }

        // Do while same java
    }
}