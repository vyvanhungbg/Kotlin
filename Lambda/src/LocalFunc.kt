fun doSomeThing(a: Int){

    //doSomeThingElse(a) // ERROR Unresolved reference: doSomeThingElse
    fun doSomeThingElse(a :Int){
        println("a = $a")
    }
    doSomeThingElse(a)
}

fun main() {
    doSomeThing(5)
}