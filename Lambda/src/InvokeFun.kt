class InvokeFun {
    operator fun invoke(string: String){
        println("Hey call invoke $string")
    }

    operator fun invoke(string: String, a:Int = 3){
        println("Hey call invoke $string and $a")
    }
}

fun main() {
    val  invokeFun:InvokeFun = InvokeFun()
    invokeFun("alo")         // Hey call invoke alo
    invokeFun("alo", 5)  //  Hey call invoke alo and 5
}