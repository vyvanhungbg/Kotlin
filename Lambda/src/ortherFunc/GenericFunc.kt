fun <T> myList(item: T): List<T> {
        return listOf(item, item , item)
}

fun main() {
    val listInt = myList<Int>(3)
    println(listInt.toString())   // [3, 3, 3]

    val listString = myList<String>("item")
    println(listString.toString())   // [item, item, item]
}