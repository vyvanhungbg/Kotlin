import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Paths

fun main() {

   println(JsonFactory.getBlogById(1))
   // println(JsonFactory.getAllBlog())
   // println(JsonFactory.getJson(PathOfApi.pathBlog,true))
   // println(Paths.get(".").toAbsolutePath().normalize().toString()+"/data.txt")
}