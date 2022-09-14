import ortherFunc.doSomeThingWith

fun doSomeThing(a: Int){

    //doSomeThingElse(a) // ERROR Unresolved reference: doSomeThingElse
    val b = 100
    fun doSomeThingElse(a :Int){
        println("a = ${a + b}")
    }
    doSomeThingElse(a)
}

fun main() {
    doSomeThing(5) // a = 105
    //doSomeThingWith()
}