import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class SerializableFileFactory {

    fun SaveFile(data:MutableList<SanPham>,path:String):Boolean
    {
        try {
            var fos=FileOutputStream(path);
            var oos=ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
            return true
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return false
    }

    fun ReadFile(path:String):MutableList<SanPham>
    {
        var data:MutableList<SanPham> = mutableListOf()
        try
        {
            var fis=FileInputStream(path);
            var ois=ObjectInputStream(fis);
            var obj=ois.readObject();
            data= obj as MutableList<SanPham>;
            ois.close();
            fis.close();
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return data
    }
}
