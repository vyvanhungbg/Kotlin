package GenericArrays

import java.util.*

fun main() {
    // khởi tạo array với tham số đầu vào
    var strings  = Array<String>(size = 5, init = { index -> "Item $index"})
    for(i in strings)
        println(i)  // print :  Item 0 , Item 1 .... Item 4;

    // In nhanh
    println(Arrays.toString(strings)) // print :  [Item 0, Item 1, Item 2, Item 3, Item 4]

    // get Item
    println(strings.get(0))  // print :  Item 5

    // set Item
    strings.set(1, "Hello")
    println(Arrays.toString(strings)) // print : [Item 0, Hello, Item 2, Item 3, Item 4]

}