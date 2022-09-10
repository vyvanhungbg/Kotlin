class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val color = EnumClass.BLUE
            println("r = ${color.r} g = ${color.g} b = ${color.b} ")

            for(item in EnumClass.values())
                println("Item = $item")

            for(item in enumValues<EnumClass>())
                println("Item = $item")
        }
    }

}