class Outer {
    private val ma:Int = 1
    class Nested {  // lớp này nằm trong lớp khác nhưng khogn the truy cap thuoc tinh của class ngoài
        fun show() = println("Day la phương thức show class Nester")
       // fun show1() = println("Day la phương thức show class Nester $ma") // không thể truy cập ma trong class Outer
    }

    inner class Inner{
        fun show() = println("Day la phương thức show class Inner")
        fun show1() = println("Day la phương thức show class Inner with $ma")
    }
}