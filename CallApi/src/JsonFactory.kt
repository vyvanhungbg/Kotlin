import com.google.gson.Gson
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.StandardCharsets


class JsonFactory {

    companion object{
        fun getJson(path:String, authorization:Boolean):String{

            var url:URL = URL(path)
            var connection:HttpURLConnection = url.openConnection() as HttpURLConnection

            if(authorization){
                var token =  ReadFile(PathOfApi.pathToken)
                try {
                    if(token.isEmpty()){
                        token = getToken()
                        SaveFile(token, PathOfApi.pathToken)
                        println("token trống")
                    }
                    token = ReadFile(PathOfApi.pathToken)
                    connection.setRequestProperty("Authorization","Bearer "+token);
                }catch (e :Exception){
                    e.printStackTrace()

                }finally {
                    if( connection.responseCode == 401){
                        token = getToken()
                        SaveFile(token, PathOfApi.pathToken)
                        connection.setRequestProperty("Authorization","Bearer "+token);
                        println("401 nên chạy lại")
                    }
                    var isr = InputStreamReader(connection.inputStream, "UTF-8")
                    var br = BufferedReader(isr)
                    var str = br.readText()
                    return str
                }

            }else{
                var isr = InputStreamReader(connection.inputStream, "UTF-8")
                var br = BufferedReader(isr)
                var str = br.readText()
                return str
            }

        }

        fun getToken():String{
            var url:URL = URL(PathOfApi.pathLogin)
            var connection:HttpURLConnection = url.openConnection() as HttpURLConnection

            connection.setRequestMethod("POST")
            connection.setDoOutput(true)
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            val data:String = "username=string&password=string"

            val out = data.toByteArray(StandardCharsets.UTF_8)
            var stream:OutputStream = connection.getOutputStream()
            stream.write(out)

            var isr = InputStreamReader(connection.inputStream, "UTF-8")
            var br = BufferedReader(isr)
            var str = br.readText()

            var token:String = Gson().fromJson(str, Token::class.java).access_token
            return token
        }

        fun getBlogById(id:Int):Blog{
            var path:String = PathOfApi.pathBlog.plus(id)
            var gson:Gson = Gson()
            var blog:Blog = gson.fromJson(getJson(path, false), Blog::class.java)
            return blog
        }
        fun getAllBlog(): MutableList<Blog> {
            var path:String = PathOfApi.pathBlog
            var gson:Gson = Gson()
            class ListBlog{
                var list:MutableList<Blog> = mutableListOf();
            }

            val str = getJson(path, true)
            println(str)
            var tmp:ListBlog  = gson.fromJson(str, ListBlog::class.java)

            return  tmp.list

        }

        fun SaveFile(str:String, path:String):Boolean{
            try {
                val fos = FileOutputStream(path)
                val osw = OutputStreamWriter(fos, "UTF-8")
                val bw = BufferedWriter(osw)
                    bw.write(str)
                    bw.newLine()
                bw.close()
                osw.close()
                fos.close()
                return true
            }catch (e:Exception){
                e.printStackTrace()
            }
            return false
        }

        fun ReadFile(path:String):String{
            var line = ""
            try {
                val fis = FileInputStream(path)
                val isr = InputStreamReader(fis,"UTF-8")
                val br = BufferedReader(isr)
                 line = br.readLine()

                br.close()
                isr.close()
                fis.close()
            }catch (e:Exception){
                e.printStackTrace()
            }
            return line.orEmpty()

        }
    }
}