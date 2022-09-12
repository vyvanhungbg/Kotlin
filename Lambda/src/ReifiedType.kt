/*fun <T> checkType(obj : Any):Boolean{
    return obj is T   //Cannot check for instance of erased type: T
}*/
inline fun <reified T> checkType(obj: Any):Unit = when{
    obj is Int  -> println("Class Int")
    obj is String-> println("Class String")
    else -> println("# ${obj::class.simpleName}")
}
fun main() {

    checkType <Any>("23")  // Class String
    checkType <Any>(23)  // Class Int
    checkType <Any>(23.5F)  // # Float
}
