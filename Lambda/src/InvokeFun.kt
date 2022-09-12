class InvokeFun(var string: String) {
    operator fun invoke(string: String){
        println("Hey call invoke $string")
    }
}