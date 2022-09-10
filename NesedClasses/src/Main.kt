class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val demo = Outer().Nested()
            val fooValue = demo.foo()
            println("foo Value $fooValue")
        }
    }
}