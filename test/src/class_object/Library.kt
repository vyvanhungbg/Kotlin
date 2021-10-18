package class_object

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    // Xử lí sô
    var a:Double = 10/3.0
    println("%.2f".format(a))
    //
    var x:Int = 1928392844
    var dcf = DecimalFormat("#,###.## vnđ")
    var dcfs = DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator  = ','
    dcf.decimalFormatSymbols = dcfs
   // dcf.currency()
    println("x = $x")
    println("x = ${dcf.format(x)}")


    // Xử lí ngày tháng
    var calendar = Calendar.getInstance()
    var year =  calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH)+1  // thang 0->11
    var day = calendar.get(Calendar.DAY_OF_MONTH)
    println("$day - $month - $year")

    //
    var date = calendar.time
    var sdf = SimpleDateFormat("dd/MM/YYYY - hh:mm:ss:aa") // muon 24h thi hh -> HH
    println(sdf.format(date))
}