import Shape.Circle

class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val shape: Shape.Circle = Shape.Circle(3.4F)
            val shape1: Shape.Rectangle = Shape.Rectangle(breadth = 5, length = 4)
            val shape2: Shape.Square = Shape.Square(3)
            eval(shape1)
        }
    }
}