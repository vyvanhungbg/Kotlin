interface Action {
    val name:String

    fun fly()

    fun eat(){
        println("Interface eat")
    }
     fun go(){
        println("Interface go")
    }
}