package myMath

import java.text.SimpleDateFormat
import java.util.*

fun getPi():Float{
    return 3.14f
}
fun getDate():String{
    val date = Date()
    val dateFormat = "dd/MM/yyyy"
    val sdf = SimpleDateFormat(dateFormat)
    return sdf.format(date)
}
