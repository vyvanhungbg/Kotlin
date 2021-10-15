package bai2

class NSX(var maNSX:String, var tenNSX:String, var dcNSX:String) {
    constructor():this("", "",""){}
    fun nhap(){
        maNSX = readLine().toString()
        tenNSX = readLine().toString()
        dcNSX = readLine().toString()
    }

    fun xuat(){
        println("\n$maNSX\n$tenNSX\n$dcNSX")
    }
}