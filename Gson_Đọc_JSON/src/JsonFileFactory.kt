import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.FileReader
import java.io.FileWriter
import java.lang.reflect.Type

class JsonFileFactory {

    fun SaveFile(data:MutableList<Any>, path:String):Boolean{
        try {
            val gs = Gson()
            val file = FileWriter(path)
            gs.toJson(data,file)
            file.close()
            return true
        }catch (e:Exception){
            e.printStackTrace()
        }
        return false
    }
    fun ReadFile(path:String):MutableList<Any>{
        var data:MutableList<Any> = mutableListOf()
        try {
            val gs = Gson()
            val file = FileReader(path)
            data = gs.fromJson(file,object :TypeToken<MutableList<SanPham>>(){}.type)
            file.close()
        }catch (e:Exception){
            e.printStackTrace()
        }
        return data
    }
}