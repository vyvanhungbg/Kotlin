fun main(args: Array<String>) {
    try {
        var a:Int=5
        var b:Int=0;
        var c=a/b
        println("$a/$b=$c")
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    finally {
        println("Đây là finally, 100% chạy, cho dù lỗi hay không")
    }

   try {
       chia(5,0)
       println("Cám ơn!")
   }catch (e:Exception){
       e.message
   }

}

// ném lỗi ra ngoài
fun chia(a:Int,b:Int):Int
{
    if(b==0)
        throw Exception("Mẫu số = 0")
    return a/b
}
