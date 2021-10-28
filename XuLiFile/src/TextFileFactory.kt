import java.io.*

class TextFileFactory {

    fun SaveFile(data:MutableList<SanPham>, path:String):Boolean{
        try {
            val fos = FileOutputStream(path)
            val osw = OutputStreamWriter(fos, "UTF-8")
            val bw = BufferedWriter(osw)
            for(item in data){
                bw.write(item.toString())
                bw.newLine()
            }
            bw.close()
            osw.close()
            fos.close()
            return true
        }catch (e:Exception){
            e.printStackTrace()
        }
        return false
    }

    fun ReadFile(path:String):MutableList<SanPham>{

        var data:MutableList<SanPham> = mutableListOf()
        try {
            val fis = FileInputStream(path)
            val isr = InputStreamReader(fis,"UTF-8")
            val br = BufferedReader(isr)
            var line = br.readLine()
            while (line != null){
                var arr = line.split("\t")
                if(arr.size == 3){
                    var item:SanPham = SanPham()
                    item.ma = arr[0].toInt()
                    item.ten = arr[1].toString()
                    item.donGia = arr[2].toDouble()
                    data.add(item)
                }
                line = br.readLine()
            }
            br.close()
            isr.close()
            fis.close()
        }catch (e:Exception){
            e.printStackTrace()
        }
        return data

    }
}