inline fun myFunc( process: (string:String) -> Unit){
    process("process")
    println("close func")
}
fun doSomething() {
    print("doSomething start")
    doSomethingElse()
    print("doSomething end")
}
inline fun doSomethingElse() {
    print("doSomethingElse")
}
fun main() {
    myFunc(::println)
}