package class_object

import java.util.*


fun main() {
    var a:Array<IntArray> = Array(3, {IntArray(3)})

    var rd:Random = Random()
    for (i in a.indices){
        for(j in a[i].indices)
            a[i][j] = rd.nextInt(100)
    }
    for (i in a.indices){
        for(j in a[i].indices)
           print("${a[i][j]} ")
        println()
    }
}