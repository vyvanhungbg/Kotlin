import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


fun main() {
    var url: URL = URL("http://dongabank.com.vn//exchange//export")
    var connection: HttpURLConnection = url.openConnection() as HttpURLConnection
    var isr: InputStreamReader = InputStreamReader(connection.inputStream, "UTF-8")
    var br: BufferedReader = BufferedReader(isr)
    var s = br.readText()
    println(connection.responseCode)
    br.close()
    isr.close()
    s = s.replace("(", "")
    s = s.replace(")", "")

    println(s)

  /*  var gs: Gson = Gson()
    var dstg: TiGia = gs.fromJson<TiGia>(s, TiGia::class.java)
    for (item in dstg.items) {
        println(item)
        println("-------------------------------")
    }*/
}
