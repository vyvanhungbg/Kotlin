fun main() {
    // khởi tạo
    val list = mutableListOf<Int>(5,1, 2, 3)

    // thao tác nhiều với list
    list.also {
        it.add(4)
        it.remove(2)
        it.sort()
    }
    println(list)  // [1, 3, 4, 5]
}